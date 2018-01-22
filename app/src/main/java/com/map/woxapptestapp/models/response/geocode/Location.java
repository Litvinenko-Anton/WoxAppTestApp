package com.map.woxapptestapp.models.response.geocode;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class Location {

    @SerializedName("lat")
    private double latitude;

    @SerializedName("lng")
    private double longitude;

    private LatLng latLng;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LatLng getLatLng() {
        if (latLng == null) {
            latLng = new LatLng(latitude, longitude);
        }

        return latLng;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

}
