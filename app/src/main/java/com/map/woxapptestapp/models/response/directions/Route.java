package com.map.woxapptestapp.models.response.directions;

import com.google.gson.annotations.SerializedName;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class Route {

    @SerializedName("summary")
    public String summary;

    @SerializedName("overview_polyline")
    public OverviewPolyline overviewPolyline;

}
