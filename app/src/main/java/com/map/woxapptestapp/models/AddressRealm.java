package com.map.woxapptestapp.models;

import io.realm.RealmObject;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class AddressRealm extends RealmObject {

    private String address;
    private double latitude;
    private double longitude;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
