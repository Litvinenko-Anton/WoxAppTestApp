package com.map.woxapptestapp.models.response.distance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class Distance {
    @SerializedName("text")
    public String distanceText;
    @SerializedName("value")
    public int distanceValue;
}
