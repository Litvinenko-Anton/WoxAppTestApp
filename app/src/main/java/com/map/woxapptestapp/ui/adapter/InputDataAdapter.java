package com.map.woxapptestapp.ui.adapter;

import android.annotation.SuppressLint;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.model.LatLng;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.map.woxapptestapp.models.response.AddressModel;
import com.map.woxapptestapp.models.response.LayoutIdModels;
import com.map.woxapptestapp.models.response.distance.Distance;
import com.map.woxapptestapp.models.response.distance.Duration;
import com.map.woxapptestapp.models.response.geocode.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import io.reactivex.disposables.Disposable;

import static com.map.woxapptestapp.App.logD;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class InputDataAdapter {

    public static final int MIN_USER_POINTS = 2;
    public static final int MAX_USER_POINTS = 5;

    @SuppressLint("UseSparseArrays")
    private Map<Integer, AddressModel> mAddressModelMap = new HashMap<>();
    private List<AddressModel> mAddressModelList = new ArrayList<>();
    private OnAddressTextChangListener mTextChangedListener;
    private long mDistanceDuration;
    private Distance distance;
    private Duration duration;
    private List<LatLng> lineLocationsList;

    public List<LatLng> getLineLocationsList() {
        return lineLocationsList;
    }

    public void setLineLocationsList(List<LatLng> lineLocationsList) {
        this.lineLocationsList = lineLocationsList;
    }

    public void setOnAddressTextChangListener(OnAddressTextChangListener textChangedListener) {
        this.mTextChangedListener = textChangedListener;
    }

    public void setDistanceMatrix(Distance distance, Duration duration) {
        this.distance = distance;
        this.duration = duration;
    }

    public void setDistanceDuration(long distanceDuration) {
        mDistanceDuration = distanceDuration;
    }

    public long getDistanceDuration() {
        return mDistanceDuration;
    }

    public Distance getDistance() {
        return distance;
    }

    public Duration getDuration() {
        return duration;
    }

    public boolean addEditTextGroup(View view) {
        if (view != null) {
            LayoutIdModels layoutIdModels = generateLayoutIdModels(view);
            if (!isMax() && checkAddressModelMap(layoutIdModels)) {
                //TODO Disposable
                initRxTextView(view.findViewWithTag("address"));
                return true;
            }
        }
        return false;
    }

    public AddressModel addEditTextGroup(View view, LayoutIdModels layoutIdModels) {
        if (!isMax()) {
            //TODO Disposable
            EditText text = view.findViewById(layoutIdModels.getEditTextId());
            initRxTextView(text);
            return findAddressModelByEditText(layoutIdModels.getEditTextId());
        }
        return null;
    }

    public boolean isMax() {
        return mAddressModelList.size() >= MAX_USER_POINTS;
    }

    public boolean isMin() {
        return mAddressModelList.size() <= MIN_USER_POINTS;
    }

    public LayoutIdModels generateLayoutIdModels(View view) {
        return new LayoutIdModels(
                setViewId(view, "container"),
                setViewId(view, "marker"),
                setViewId(view, "address"),
                setViewId(view, "close")
        );
    }

    private int setViewId(View view, String tag) {
        View childView = view.findViewWithTag(tag);
        childView.setId(View.generateViewId());
        return childView.getId();
    }

    private int setViewId(View view, @IdRes int id) {
        View childView = view.findViewById(id);
        childView.setId(UUID.randomUUID().hashCode());
        return childView.getId();
    }

    public boolean addEditText(EditText editText) {
//        if (editText != null) {
//            if (mAddressModelList.size() < MAX_USER_POINTS
//                    && checkAddressModelMap(editText.getId()))
//                //TODO Disposable
//                initRxTextView(editText);
//            return true;
//        }
        return false;
    }

    public List<AddressModel> getAddressModelList() {
        return mAddressModelList;
    }

    public boolean checkAddressModelMap(LayoutIdModels layoutIdModels) {
        if (!mAddressModelMap.containsKey(layoutIdModels.getEditTextId())) {
            AddressModel addressModel = new AddressModel(layoutIdModels);
            mAddressModelMap.put(layoutIdModels.getEditTextId(), addressModel);
            mAddressModelList.add(addressModel);
            return true;
        }
        return false;
    }

    private Disposable initRxTextView(EditText editText) {
        return RxTextView.textChangeEvents(editText)
                .skipInitialValue()
                .debounce(200, TimeUnit.MILLISECONDS)
                .filter(textChangeEvent -> textChangeEvent.text().length() > 3)
                .subscribe(textChangeEvent -> {
                    if (mTextChangedListener != null && mAddressModelMap.containsKey(editText.getId())) {
                        logD("editText view id: " + editText.getId());
                        AddressModel addressModel = mAddressModelMap.get(editText.getId());
                        addressModel.setUserAddress(textChangeEvent.text().toString());
                        mTextChangedListener.loadAddress(addressModel);
                    }
                });
    }

    public boolean checkPossibilityRequest() {
        int addressCount = 0;
        for (AddressModel addressModel : mAddressModelList)
            if (addressModel.getAddress() != null)
                addressCount += 1;
        return addressCount > 1;
    }

    public String getLocationFrom() {
        String from = "";
        for (int i = 0; i < mAddressModelList.size(); i++) {
            if (mAddressModelList.get(i).getAddress() != null) {
                LatLng addressLatLng = mAddressModelList.get(i).getAddressLatLng();
                from = addressLatLng.latitude + "," + addressLatLng.longitude;
                return from;
            }
        }
        return from;
    }

    public LatLng getLatLngFrom() {
        for (int i = mAddressModelList.size() - 1; i >= 0; i--)
            if (mAddressModelList.get(i).getAddress() != null)
                return mAddressModelList.get(i).getAddressLatLng();
        return null;
    }


    public String getLocationTo() {
        String to = "";
        for (int i = mAddressModelList.size() - 1; i >= 0; i--) {
            if (mAddressModelList.get(i).getAddress() != null) {
                LatLng addressLatLng = mAddressModelList.get(i).getAddressLatLng();
                to = addressLatLng.latitude + "," + addressLatLng.longitude;
                return to;
            }
        }
        return to;
    }

    public List<LatLng> getIntervalLocations() {
        List<LatLng> intervalList = new ArrayList<>();
        if (mAddressModelList.size() > 2) {
            for (int i = 1; i < mAddressModelList.size() - 1; i++) {
                if (mAddressModelList.get(i).getAddress() != null) {
                    intervalList.add(mAddressModelList.get(i).getAddress().getLatLng());
                }
            }
        }
        return intervalList;
    }

    public AddressModel findAddressModelByEditText(EditText editText) {
        return mAddressModelMap.get(editText.getId());
    }

    public AddressModel findAddressModelByEditText(@IdRes int id) {
        return mAddressModelMap.get(id);
    }

    public AddressModel findAddressModelById(@IdRes int id) {
        for (AddressModel addressModel : mAddressModelList)
            if (addressModel.containsId(id))
                return addressModel;
        return null;
    }

    public boolean removeAddressModel(AddressModel addressModel) {
        if (addressModel != null) {
            mAddressModelMap.remove(addressModel.getEditTextId());
            mAddressModelList.remove(addressModel);
            addressModel.clear();
            return true;
        }
        return false;
    }

    public List<Address> getAddressList() {
        List<Address> addresses = new ArrayList<>();
        for (AddressModel addressModel : mAddressModelList) {
            Address address = addressModel.getAddress();
            addresses.add(address);
        }
        return addresses;
    }

    public String getAddressTitle() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < mAddressModelList.size(); i++) {
            Address address = mAddressModelList.get(i).getAddress();
            if (address != null) {
                stringBuilder.append(address.getAddress());
                if (i < mAddressModelList.size() - 1)
                    stringBuilder.append(" -> ");
            }
        }
        return stringBuilder.toString();
    }
}
