package com.map.woxapptestapp.models.response.geocode;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by i7-4770k on 19.01.2018
 *
 * {
 "results" : [
 {
 "address_components" : [
 {
 "long_name" : "Dnieper River",
 "short_name" : "Dnieper river",
 "types" : [ "establishment", "natural_feature" ]
 }
 ],
 "formatted_address" : "Dnieper river",
 "geometry" : {
 "bounds" : {
 "northeast" : {
 "lat" : 55.93779619999999,
 "lng" : 35.2910955
 },
 "southwest" : {
 "lat" : 46.4637095,
 "lng" : 29.924464
 }
 },
 "location" : {
 "lat" : 51.2007528,
 "lng" : 32.6077798
 },
 "location_type" : "APPROXIMATE",
 "viewport" : {
 "northeast" : {
 "lat" : 55.93779619999999,
 "lng" : 35.2910955
 },
 "southwest" : {
 "lat" : 46.4637095,
 "lng" : 29.924464
 }
 }
 },
 "place_id" : "ChIJs07MInFx1UYR3jMwEmVmH20",
 "types" : [ "establishment", "natural_feature" ]
 }
 ],
 "status" : "OK"
 }

 */

public class GeocodeResponse {

    @SerializedName("results")
    public List<Address> address;

}
