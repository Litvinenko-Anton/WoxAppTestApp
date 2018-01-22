package com.map.woxapptestapp.models.response;

import android.content.Context;
import android.support.annotation.IdRes;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.gms.maps.model.LatLng;
import com.map.woxapptestapp.models.response.geocode.Address;
import com.map.woxapptestapp.ui.adapter.CostumeArrayAdapter;

import java.util.List;

/**
 * Created by i7-4770k on 21.01.2018
 */

public class AddressModel {

    private final LayoutIdModels idModels;
    private Address address;
    private String userAddress;
    private List<Address> addressList;
    private CostumeArrayAdapter<String> stringArrayAdapter;


    public AddressModel(LayoutIdModels idModels) {
        this.idModels = idModels;
    }

    public int getEditTextId() {
        return idModels.getEditTextId();
    }

    public int getParentLayoutId() {
        return idModels.getParentLayoutId();
    }

    public int getImageButtonId() {
        return idModels.getImageButtonId();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public ArrayAdapter<String> initArrayAdapter(AutoCompleteTextView editText, Context context) {
        if (stringArrayAdapter == null)
            stringArrayAdapter = new CostumeArrayAdapter<>(context, android.R.layout.simple_dropdown_item_1line);
        if (editText != null)
            editText.setAdapter(stringArrayAdapter);
        return stringArrayAdapter;
    }

    public ArrayAdapter<String> getArrayAdapter() {
        return stringArrayAdapter;
    }

    public void notifyArrayAdapter() {
        String[] addressStrings = new String[addressList.size()];
        for (int i = 0; i < addressStrings.length; i++)
            addressStrings[i] = addressList.get(i).getAddress();
        stringArrayAdapter.clear();
        stringArrayAdapter.addAll(addressStrings);
    }

    public boolean initSelectedAddress(int position) {
        if (addressList != null && position > -1 && position < addressList.size()) {
            this.address = addressList.get(position);
            return true;
        }
        return false;
    }

    public LatLng getAddressLatLng() {
        return (address != null) ? address.getLatLng() : null;
    }

    public boolean containsId(@IdRes int id) {
        return (idModels.containsId(id));
    }

    public void clear() {
        idModels.clear();
        address = null;
        userAddress = "";
        if (addressList != null)
            addressList.clear();
        if (stringArrayAdapter != null)
            stringArrayAdapter.clear();
    }

    public boolean checkUserAddress() {
        return address == null || (!sameLengthAddress() || !equalsAddress());
    }

    private boolean sameLengthAddress() {
        return address.getAddress().length() == userAddress.length();
    }

    private boolean equalsAddress() {
        return address.getAddress().equals(userAddress);
    }
}
