package com.map.woxapptestapp.models.response.geocode;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class Address {

    @SerializedName("formatted_address")
    private String address;

    @SerializedName("geometry")
    private Geometry geometry;

    private LatLng latLng;

    public String getAddress() {
        return address;
    }

    public String getPlaceId() {
        return geometry.placeId;
    }

    public LatLng getLatLng() {
        return (latLng == null) ? latLng = geometry.location.getLatLng() : latLng;
    }

}
