package com.map.woxapptestapp.models.response.distance;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by i7-4770k on 21.01.2018
 */

public class Row {
    @SerializedName("elements")
    public List<Element> elements;
}
