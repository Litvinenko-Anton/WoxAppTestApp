package com.map.woxapptestapp.models.response.distance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by i7-4770k on 21.01.2018
 */

public class Element {
    @SerializedName("distance")
    public Distance distance;
    @SerializedName("duration")
    public Duration duration;
}
