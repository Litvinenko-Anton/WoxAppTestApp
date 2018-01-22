package com.map.woxapptestapp.retrofit;

import com.map.woxapptestapp.models.response.directions.DirectionsResponse;
import com.map.woxapptestapp.models.response.distance.DistanceMatrixResponse;
import com.map.woxapptestapp.models.response.geocode.GeocodeResponse;

import javax.inject.Singleton;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by i7-4770k on 19.01.2018
 * API: BaseUrl -> https://maps.googleapis.com/maps/api/
 *
 * Geocoding API - преобразования адресов (например, "1600 Amphitheatre Parkway, Mountain View, CA")
 * в географические координаты (например, широта 37,423021 и долгота -122,083739)
 * https://developers.google.com/maps/documentation/geocoding/intro
 *
 * Directions API – позволяет рассчитывать маршруты между разными точками
 * https://developers.google.com/maps/documentation/directions/intro
 *
 * Distance Matrix API – предоставляет информацию о расстоянии
 * и времени поездки для матрицы исходных точек и пунктов назначения.
 * https://developers.google.com/maps/documentation/distancematrix/intro
 *
 */

@Singleton
public interface GoogleMapsApi {

    @GET("geocode/json")
    Observable<GeocodeResponse> getGeocode(@Query("address") String address);

    @GET("directions/json")
    Observable<DirectionsResponse> getDirections(@Query("origin") String from, @Query("destination") String to, @Query("waypoints") String points);

    @GET("distancematrix/json")
    Observable<DistanceMatrixResponse> getDistanceMatrix(@Query("origins") String start, @Query("destinations") String finish);



    //TODO for DEBUG

    @GET("geocode/json")
    Call<ResponseBody> getResponseBodyGeocode(@Query("address") String address);

    @GET("directions/json")
    Call<ResponseBody> getResponseBodyDirections(@Query("origin") String from, @Query("destination") String to, @Query("waypoints") String points);

    @GET("distancematrix/json")
    Call<ResponseBody> getResponseBodyDistanceMatrix(@Query("origins") String from, @Query("destinations") String to);

}
