package com.map.woxapptestapp.ui.activiy;


import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.PolyUtil;
import com.map.woxapptestapp.App;
import com.map.woxapptestapp.models.RideUserData;
import com.map.woxapptestapp.models.RideUserDateList;
import com.map.woxapptestapp.models.response.AddressModel;
import com.map.woxapptestapp.models.response.directions.DirectionsResponse;
import com.map.woxapptestapp.models.response.directions.Route;
import com.map.woxapptestapp.models.response.distance.DistanceMatrixResponse;
import com.map.woxapptestapp.models.response.distance.Element;
import com.map.woxapptestapp.models.response.distance.Row;
import com.map.woxapptestapp.models.response.geocode.GeocodeResponse;
import com.map.woxapptestapp.retrofit.GoogleMapsApi;
import com.map.woxapptestapp.tools.SharedPrefManager;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.map.woxapptestapp.App.logD;

/**
 * Советы:
 * Для инициализации в Presenter сделайте метод Presenter.init(); или Presenter.startConfig();
 * Пока жив процесс, получить доступ к MvpPresenterStore можно через MvpFacade.getInstance().getPresenterStore();
 *
 * @InjectPresenter (type PresenterType.LOCAL, tag MainActivity.TAG)
 * PresenterType.LOCAL     – presenter живет пока View не финиширует
 * PresenterType.GLOBAL    – presenter живет пока живет процесс
 * PresenterType.WEAK      – presenter живет пока не финишируют все View
 * ViewState               - пока жив Presenter(в save state не сохраняется)
 */

@InjectViewState
public class MainPresenter extends MvpPresenter<MainPresenter.MainPresenterView> {

    private CompositeDisposable compositeDisposable = new CompositeDisposable(); // All unsubscribe
    private Disposable disposableLoader;

    @Inject
    GoogleMapsApi api;
    @Inject
    SharedPrefManager sharedPrefManager;

    public void startConfig() {
        App.getComponent().inject(this);
    }

    @Override
    public void onDestroy() {
        if (compositeDisposable != null)
            compositeDisposable.clear();
//        stopRealm();
        super.onDestroy();
    }

    public void saveRideAddresses(RideUserData rideUserData) {
        RideUserDateList list = sharedPrefManager.getUserData(RideUserDateList.class);
        list.add(rideUserData);
        sharedPrefManager.setUserData(list);
        getViewState().saveAddressesResult(true, "Ride is saved");
    }

    public void removeAllHistory() {
        sharedPrefManager.clear();
        getViewState().saveAddressesResult(true, "All history is removed");
    }

    public void loadAddresses(AddressModel addressModel) {
        logD("loadAddresses");
//        showResultJson(api.getResponseBodyGeocode(addresses)); //TODO DEBUG

        if (addressModel.checkUserAddress())
            processingDisposable(
                    api.getGeocode(addressModel.getUserAddress())
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe(
                                    response -> {
                                        logD("addressesLoaded");
                                        getViewState().responseComplete(addressModel, response);
                                    },
                                    throwable -> getViewState().responseError("Can't load address")
                            )
            );
    }

    public void loadDirections(String from, String to, List<LatLng> locations) {
        logD("loadDirections -> from:" + from + " to:" + to + " points:" + concatLocationsPoints(locations));
//        showResultJson( api.getResponseBodyDirections(from, to, points)); //TODO DEBUG

        processingDisposable(
                api.getDirections(from, to, concatLocationsPoints(locations))
                        .doOnNext(response -> {
                            List<LatLng> positionsList = response.initPositionsList();
                            for (Route route : response.routes) {
                                String polylinePoints = route.overviewPolyline.polylinePoints;
                                logD("Polyline.length: " + ((polylinePoints == null) ? -1 : polylinePoints.length()));
                                if (polylinePoints != null)
                                    positionsList.addAll(PolyUtil.decode(polylinePoints));
                            }
                        })
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                response -> getViewState().responseComplete(response),
                                Throwable::printStackTrace
                        )
        );
    }
//    public void loadRouteDuration(String from, List<LatLng> locations) {

    public void loadRouteDuration(String from, String to) {
        logD("loadRouteDuration");

//        showResultJson(api.getResponseBodyDistanceMatrix(from, to)); //TODO DEBUG

        processingDisposable(
                api.getDistanceMatrix(from, to)
                        .map(response -> {
                            long duration = 0;
                            for (Row row : response.rows)
                                for (Element element : row.elements)
                                    duration += element.duration.durationValue;

                            getViewState().responseComplete(response);
                            return duration;
                        })
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                duration -> getViewState().carAnimation(duration),
                                Throwable::printStackTrace
                        )
        );

    }

    public String concatLocationsPoints(List<LatLng> locations) {
        if (locations != null && locations.size() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < locations.size(); i++) { //TODO limit
                LatLng latLng = locations.get(i);
                stringBuilder.append((float) latLng.latitude);
                stringBuilder.append(',');
                stringBuilder.append((float) latLng.longitude);
                if (i != locations.size() - 1)
                    stringBuilder.append('|');
            }
            return stringBuilder.toString();
        } else {
            return "";
        }
    }

    private void processingDisposable(Disposable disposable) {
        if (disposableLoader != null && !disposableLoader.isDisposed())
            disposableLoader.dispose();
        disposableLoader = disposable;
        compositeDisposable.add(disposableLoader);
    }

    private void showResultJson(final Call<ResponseBody> result) {
        result.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String json = response.body().string();
                    logD(json);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    /**
     * All of the methods that should be in Fragment
     *
     * @StateStrategyType(SkipStrategy.class) AddToEndStrategy             – выполнит команду, добавит команду в конец очереди команд. Default.
     * AddToEndSingleStrategy       – выполнит команду, добавит команду в конец очереди и УДАЛИТЬ ВСЕ ЕЕ ПРЕДЫДУЩИЕ экземпляры.
     * SingleStateStrategy          – выполнит команду, ОЧИСТИТ ВСЮ ОЧЕРЕДЬ КОМАНД, добавит команду в 'очередиь'.
     * SkipStrategy                 – не гарантированно выполнит команду (if (View != null)). Команда НЕ БУДЕТ ДОБАВЛЕНА в очередь, и никак не изменит текущую очередь.
     * OneExecutionStateStrategy    – гарантированно выполнит команду (при первой возможности). Команда НЕ БУДЕТ ДОБАВЛЕНА в очередь..
     * <p>
     * https://habrahabr.ru/company/redmadrobot/blog/325816/
     */
    @StateStrategyType(AddToEndSingleStrategy.class)
    public interface MainPresenterView extends MvpView {

        void responseComplete(AddressModel addressModel, GeocodeResponse response);

        void responseComplete(DirectionsResponse response);

        void responseComplete(DistanceMatrixResponse response);

        void responseError(String errorMessage);

        void carAnimation(long duration);

        void saveAddressesResult(boolean success, String message);

    }
}
