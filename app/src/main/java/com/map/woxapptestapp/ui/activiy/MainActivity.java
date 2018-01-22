package com.map.woxapptestapp.ui.activiy;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.map.woxapptestapp.R;
import com.map.woxapptestapp.models.RideUserData;
import com.map.woxapptestapp.models.response.AddressModel;
import com.map.woxapptestapp.models.response.LayoutIdModels;
import com.map.woxapptestapp.models.response.directions.DirectionsResponse;
import com.map.woxapptestapp.models.response.distance.DistanceMatrixResponse;
import com.map.woxapptestapp.models.response.distance.Element;
import com.map.woxapptestapp.models.response.distance.Row;
import com.map.woxapptestapp.models.response.geocode.Address;
import com.map.woxapptestapp.models.response.geocode.GeocodeResponse;
import com.map.woxapptestapp.tools.ResUtils;
import com.map.woxapptestapp.ui.adapter.DoubleArrayEvaluator;
import com.map.woxapptestapp.ui.adapter.InputDataAdapter;
import com.map.woxapptestapp.ui.fragment.HistoryFragment;
import com.map.woxapptestapp.ui.fragment.ItemSelectedListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnLongClick;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static com.map.woxapptestapp.App.logD;
import static com.map.woxapptestapp.App.toast;
import static com.map.woxapptestapp.App.toastD;
import static com.map.woxapptestapp.tools.ResUtils.getColorIntRes;

public class MainActivity extends BaseActivity implements
        MainPresenter.MainPresenterView,
        OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        ItemSelectedListener {

    @InjectPresenter
    MainPresenter mainPresenter;

    @BindView(R.id.input_address_container)
    LinearLayout inputAddressContainer;

    @BindView(R.id.startFab)
    FloatingActionButton startFab;

    private final int PERMISSIONS_REQUEST_CODE = 12345;
    private static final int MAP_ZOOM_DEFAULT = 14;

    private GoogleApiClient mGoogleApiClient;
    private GoogleMap mGoogleMap;
    private Location lastLocation;
    private InputDataAdapter inputTextAdapter;
    private Map<Integer, EditText> editTextMap = new HashMap<>();

    private BitmapDescriptor mCarMarkerBitmap;
    private ValueAnimator carValueAnimator;
    private boolean carIsAnimated;
    private Marker carMarker;
    private Dialog dialog;
    private double[] animValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindButterKnife(this);

        initLastLocationListener();
        initGoogleClient();
        initInputTextAdapter();

        addInputAddressItemView();
        addInputAddressItemView();

        mCarMarkerBitmap = ResUtils.getBitmapDescriptorRes(R.drawable.car_pin);
        mainPresenter.startConfig();
    }


    @OnClick(R.id.historyFab)
    public void historyFabClick() {
        hideKeyBoard();
//        senDirectionsRequest();
        startFragmentHistory(HistoryFragment.newInstance(), R.id.root_container, HistoryFragment.TAG);
    }

    @OnClick(R.id.startFab)
    public void startFabClick() {
        if (carValueAnimator == null)
            startCar();
        else if (carValueAnimator.isStarted())
            stopCar();
        else if (carValueAnimator.isPaused())
            resumeCar();
    }

    @OnClick(R.id.addFab)
    public void addFabClick() {
        addInputAddressItemView();
    }

    @OnLongClick(R.id.addFab)
    public boolean addFabLongClick() {
        saveRideAddresses();
        return true;
    }


    private void saveRideAddresses() {
        RideUserData rideUserData = new RideUserData();
        rideUserData.setAddress(inputTextAdapter.getAddressTitle());
        rideUserData.setAddresses(inputTextAdapter.getAddressList());
        mainPresenter.saveRideAddresses(rideUserData);
    }


    private void startCar() {
        List<LatLng> intervalLocationsList = inputTextAdapter.getLineLocationsList();
        Object intervalLocationsArr[] = new Object[intervalLocationsList.size()];
        for (int i = 0; i < intervalLocationsList.size(); i++) {
            intervalLocationsArr[i] = new double[]{intervalLocationsList.get(i).latitude, intervalLocationsList.get(i).longitude};
        }

        if (inputTextAdapter.checkPossibilityRequest()) {
            carMarker = setCarMarker(inputTextAdapter.getLatLngFrom());
            carValueAnimator = createCarAnimator(inputTextAdapter.getDistanceDuration(), intervalLocationsArr);
            carValueAnimator.start();
        }
    }

    private void stopCar() {
        if (carValueAnimator != null)
            carValueAnimator.cancel();
    }

    private void resumeCar() {
        if (carValueAnimator != null)
            carValueAnimator.resume();
    }


    private void initInputTextAdapter() {
        inputTextAdapter = new InputDataAdapter();
        inputTextAdapter.setOnAddressTextChangListener(addressModel ->
                mainPresenter.loadAddresses(addressModel));
    }

    private void addInputAddressItemView() {
        if (!inputTextAdapter.isMax()) {
            View view = generateInputAddressItemView();
            LayoutIdModels layoutIdModels = inputTextAdapter.generateLayoutIdModels(view);
            if (inputTextAdapter.checkAddressModelMap(layoutIdModels)) {
                inputAddressContainer.addView(view);

                AddressModel addressModel = inputTextAdapter.addEditTextGroup(view, layoutIdModels);
                AutoCompleteTextView text = view.findViewById(layoutIdModels.getEditTextId());
                addressModel.initArrayAdapter(text, this);
                text.setOnItemClickListener((parent, view1, position, id1) -> {
                    chooseSelectedAddress(text, position);
                    senDirectionsRequest();
                });

                editTextMap.put(text.getId(), text);
                View closeBtn = view.findViewById(layoutIdModels.getImageButtonId());
                closeBtn.setOnClickListener(closeBtnClickListener);
            }
        } else {
            toast("Maximum number of points 5");
        }

    }

    public void updateMap(GoogleMap googleMap, List<AddressModel> addresses) {
        if (addresses != null && !addresses.isEmpty()) {
            if (googleMap != null) {
                googleMap.clear();
                List<LatLng> latLngList = getLatLngListFromAddress(addresses);
                switch (latLngList.size()) {
                    case 0:
                        break;
                    case 1:
                        LatLng latLng = latLngList.get(0);
                        setMarkerOnMap(latLng);
                        moveCameraMarker(mGoogleMap, latLng);
                        break;
                    default:
                        setMarkersOnMap(latLngList);
                        moveCameraBounds(mGoogleMap, latLngList);

                }
            }
        }
    }


    private List<LatLng> getLatLngListFromAddress(List<AddressModel> addresses) {
        List<LatLng> latLngList = new ArrayList<>();
        for (AddressModel addressModel : addresses) {
            LatLng latLng = addressModel.getAddressLatLng();
            if (latLng != null)
                latLngList.add(latLng);
        }
        return latLngList;
    }

    private void moveCameraMarker(GoogleMap googleMap, LatLng latLng) {
        logD("moveCameraMarker");
        if (googleMap != null)
            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(
                    new CameraPosition.Builder()
                            .target(latLng)
//                            .zoom(googleMap.getCameraPosition().zoom)
                            .zoom(MAP_ZOOM_DEFAULT)
                            .build()), 1000, null);
    }

    private void moveCameraBounds(GoogleMap googleMap, List<LatLng> latLngList) {
        logD("moveCameraBounds");
        if (googleMap != null) {
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            for (LatLng latLng : latLngList)
                builder.include(latLng);
            googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 100));
        }
    }

    private void setMarkersOnMap(List<LatLng> latLngList) {
        for (LatLng latLng : latLngList)
            setMarkerOnMap(latLng);
    }

    private void setMarkerOnMap(LatLng latLng) {
        if (mGoogleMap != null)
            mGoogleMap.addMarker(new MarkerOptions().position(latLng));
    }

    private Marker setCarMarker(LatLng latLng) {
        return mGoogleMap.addMarker(new MarkerOptions()
                .position(latLng)
                .icon(mCarMarkerBitmap));
    }

    public boolean showLine(List<LatLng> positions) {
        if (mGoogleMap != null && positions != null && positions.size() > 1) {
            PolylineOptions line = new PolylineOptions()
                    .width(5f)
                    .color(getColorIntRes(R.color.colorAccent))
                    .addAll(positions);
            mGoogleMap.addPolyline(line);
            inputTextAdapter.setLineLocationsList(positions);
            return true;
        }
        return false;
    }

    private AddressModel chooseSelectedAddress(EditText editText, int position) {
        AddressModel addressModel = inputTextAdapter.findAddressModelByEditText(editText);
        if (addressModel != null)
            addressModel.initSelectedAddress(position);
        return addressModel;
    }

    private void senDirectionsRequest() {
        mainPresenter.loadDirections(
                inputTextAdapter.getLocationFrom(),
                inputTextAdapter.getLocationTo(),
                inputTextAdapter.getIntervalLocations());
    }

    private View generateInputAddressItemView() {
        return getLayoutInflater().inflate(R.layout.input_address_item, null, false);
    }

    private View.OnClickListener closeBtnClickListener = v -> {
        AddressModel addressModel = inputTextAdapter.findAddressModelById(v.getId());
        removeInputViewGroup(addressModel);
        stopCar();
    };

    private void removeInputViewGroup(AddressModel addressModel) {
        EditText editText = editTextMap.get(addressModel.getEditTextId());
        if (cleanEditText(addressModel, editText))
            if (!inputTextAdapter.isMin()) {
                if (editTextMap.remove(addressModel.getEditTextId()) != null) {
                    inputAddressContainer.removeView(inputAddressContainer.findViewById(addressModel.getParentLayoutId()));
                    inputTextAdapter.removeAddressModel(addressModel);
                    senDirectionsRequest();
                }
            } else {
                toast("Minimum number of points 5");
            }
        senDirectionsRequest();
    }

    private boolean cleanEditText(AddressModel addressModel, EditText editText) {
        if (editText == null)
            return false;
        if (editText.getText().toString().length() > 0) {
            editText.setText("");
            addressModel.setAddress(null);
            return false;
        }
        return true;
    }

    private AutoCompleteTextView getUserInputEditText(int viewId) {
        return (AutoCompleteTextView) editTextMap.get(viewId);
    }

    private void initLastLocationListener() {
        checkPermission(ACCESS_FINE_LOCATION, PERMISSIONS_REQUEST_CODE);
        FusedLocationProviderClient mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mFusedLocationClient.getLastLocation()
                .addOnSuccessListener(this, location -> {
                    if (location != null) {
                        lastLocation = location;
                        logD("lastLocationListener " + lastLocation.toString());
                    }
                });
    }

    private void initGoogleClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this, this)
                .addConnectionCallbacks(this)
                .addApi(LocationServices.API)
                .build();
        mGoogleApiClient.connect();
        getLastLocationIfNull();
    }

    private void checkPermission(String permission, int requestCode) {
        if (ContextCompat.checkSelfPermission(getApplicationContext(), permission) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{permission}, requestCode);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
        if (requestCode == PERMISSIONS_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getLastLocation();
                moveCamera(lastLocation);
            }
        }
    }

    private void getLastLocationIfNull() {
        if (lastLocation == null)
            getLastLocation();
    }

    private void getLastLocation() {
        checkPermission(ACCESS_FINE_LOCATION, PERMISSIONS_REQUEST_CODE);
        lastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        if (lastLocation != null)
            logD("lastLocation GoogleApiClient " + lastLocation.toString());

    }

    private void moveCamera(Location lastLocation) {
        if (lastLocation != null)
            moveCamera(new LatLng(lastLocation.getLatitude(), lastLocation.getLongitude()));
    }

    private void moveCamera(LatLng latLng) {
        if (mGoogleMap != null && latLng != null)
            mGoogleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, MAP_ZOOM_DEFAULT));
    }

    private ValueAnimator createCarAnimator(long duration, Object positions[]) {
        ValueAnimator carAnimator = ValueAnimator
                .ofObject(new DoubleArrayEvaluator(), positions);
        carAnimator.setInterpolator(new LinearInterpolator());
        carAnimator.setDuration(duration);

        carAnimator.addUpdateListener(animation -> {
            animValue = (double[]) animation.getAnimatedValue();
            LatLng newLatLng = new LatLng(animValue[0], animValue[1]);
            carMarker.setPosition(newLatLng);
        });

        carAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animation) {
                logD("onAnimationCancel");
                carIsAnimated = false;
                super.onAnimationCancel(animation);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                logD("onAnimationEnd");
                super.onAnimationEnd(animation);
                endAnimation();
            }

            @Override
            public void onAnimationStart(Animator animation) {
                logD("onAnimationStart");
                carIsAnimated = true;
                super.onAnimationStart(animation);
                startFab.setImageResource(R.drawable.ic_close_24px);
                toastD(inputTextAdapter.getDistance().distanceText
                        + " / " + inputTextAdapter.getDuration().durationText);
            }

            @Override
            public void onAnimationPause(Animator animation) {
                logD("onAnimationPause");
                carIsAnimated = false;
                super.onAnimationPause(animation);
                startFab.setImageResource(R.drawable.ic_directions_car_32px);
            }

            @Override
            public void onAnimationResume(Animator animation) {
                logD("onAnimationResume");
                carIsAnimated = true;
                super.onAnimationResume(animation);
                startFab.setImageResource(R.drawable.ic_close_24px);
            }
        });

        carAnimator.addPauseListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationPause(Animator animation) {
                super.onAnimationPause(animation);
                logD("PauseListener onAnimationPause");
                super.onAnimationPause(animation);
                startFab.setImageResource(R.drawable.ic_directions_car_32px);
            }
        });

        return carAnimator;
    }

    private void endAnimation() {
        startFab.setImageResource(R.drawable.ic_directions_car_32px);
        carValueAnimator = null;
        if (carMarker != null)
            carMarker.remove();
        if (carIsAnimated) {
            if (dialog == null)
                dialog = onCreateDialog(MainActivity.this);
            dialog.show();
        }
        carIsAnimated = false;
    }

    private Dialog onCreateDialog(Context viewContext) {
        DialogInterface.OnClickListener myClickListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case Dialog.BUTTON_POSITIVE:
                        saveRideAddresses();
                        break;
                    case Dialog.BUTTON_NEGATIVE:
                        removeAllHistory();
                        break;
                    case Dialog.BUTTON_NEUTRAL:
                        break;
                }
            }
        };

        AlertDialog.Builder adb = new AlertDialog.Builder(viewContext);
        adb.setTitle(R.string.history);
        adb.setMessage(R.string.save_to_history);
        adb.setIcon(android.R.drawable.ic_delete);
        adb.setPositiveButton(R.string.ok, myClickListener);
        adb.setNegativeButton(R.string.remove_all, myClickListener);
        adb.setNeutralButton(R.string.cancel, myClickListener);
        return adb.create();                                      // create Dialog
    }

    private void removeAllHistory() {
        mainPresenter.removeAllHistory();
    }


    /**
     * Interfaces
     */

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_fragment);
        supportMapFragment.getMapAsync(this);
        getLastLocationIfNull();
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        getLastLocationIfNull();
    }

    @Override
    public void responseComplete(AddressModel addressModel, GeocodeResponse response) {
        if (response.address != null) {
            logD("addressesList.size: " + response.address.size());
            addressModel.setAddressList(response.address);
            addressModel.notifyArrayAdapter();
            updateMap(mGoogleMap, inputTextAdapter.getAddressModelList());
        }
    }

    @Override
    public void responseComplete(DirectionsResponse response) {
        logD("positionsList.size: " + response.getPositions().size());
        updateMap(mGoogleMap, inputTextAdapter.getAddressModelList());

        if (showLine(response.getPositions()) &&
                inputTextAdapter.checkPossibilityRequest())
            mainPresenter.loadRouteDuration(inputTextAdapter.getLocationFrom(), inputTextAdapter.getLocationTo());

        endAnimation();
    }


    @Override
    public void responseComplete(DistanceMatrixResponse response) {
        if (response != null)
            setDistanceMatrixFromResponse(response);
    }

    private void setDistanceMatrixFromResponse(DistanceMatrixResponse response) {
        if (response.rows != null && !response.rows.isEmpty()) {
            Row row = response.rows.get(0);
            if (row.elements != null && !row.elements.isEmpty()) {
                Element element = row.elements.get(0);
                inputTextAdapter.setDistanceMatrix(element.distance, element.duration);
            }
        }
    }

    @Override
    public void carAnimation(long duration) {
        logD("CarAnimation.duration: " + duration);
        if (duration > 0) {
            inputTextAdapter.setDistanceDuration(duration);
        }
    }

    @Override
    public void responseError(String errorMessage) {
        endAnimation();
    }

    @Override
    public void saveAddressesResult(boolean success, String message) {
        toast(message);
    }

    @Override
    public void returnItem(RideUserData data) {
        endAnimation();
        applyRideUserData(data);
    }

    private void applyRideUserData(RideUserData data) {
        int difference = inputTextAdapter.getAddressModelList().size() - data.getAddresses().size();
        if (difference == 0) {
            initRideUserData(data);
        } else {
            if (difference < 0)
                addInputAddressItemView();
            else if (difference > 0)
                removeInputAddressItemView();
            applyRideUserData(data);
        }
    }

    private void removeInputAddressItemView() {
        int lastIndex = inputTextAdapter.getAddressModelList().size() - 1;
        removeInputViewGroup(inputTextAdapter.getAddressModelList().get(lastIndex));
    }

    private void initRideUserData(RideUserData data) {
        for (int i = 0; i < data.getAddresses().size(); i++) {
            Address address = data.getAddresses().get(i);
            if (address != null) {
                AddressModel addressModel = inputTextAdapter.getAddressModelList().get(i);
                addressModel.setAddress(address);
                addressModel.setUserAddress(address.getAddress());
                editTextMap.get(addressModel.getEditTextId()).setText(address.getAddress());
            }
        }
        senDirectionsRequest();
    }

}
