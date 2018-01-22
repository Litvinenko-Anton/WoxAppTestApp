package com.map.woxapptestapp.models.response.distance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by i7-4770k on 21.01.2018
 */

public class Duration {
    @SerializedName("text")
    public String durationText;
    @SerializedName("value")
    public int durationValue;
}
