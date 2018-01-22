package com.map.woxapptestapp.models.response.geocode;

import com.google.gson.annotations.SerializedName;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class Geometry {

    @SerializedName("location")
    public Location location;

    @SerializedName("place_id")
    public String placeId;

    public Geometry(double latitude, double longitude) {
        location = new Location(latitude, longitude);
    }
}
