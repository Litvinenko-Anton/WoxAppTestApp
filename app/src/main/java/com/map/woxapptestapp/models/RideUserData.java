package com.map.woxapptestapp.models;

import com.map.woxapptestapp.models.response.geocode.Address;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class RideUserData {

    private String address = "";
    private List<Address> addresses = new ArrayList<>();


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
