package com.map.woxapptestapp.models.response.distance;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i7-4770k on 19.01.2018
 *
 {
 "destination_addresses" : [
 "Dmytra Yavornytskoho Avenue, 59А, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000",
 "Voskresenska St, 10, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000",
 "Voskresenska St, 1, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000",
 "Sicheslavska Naberezhna St, 17, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000",
 "Sicheslavska Naberezhna St, 6, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000",
 "Desantnykiv Square, 5, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000",
 "Naberezhna Zavods'ka St, 2, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000",
 "Naberezhna Zavods'ka St, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000",
 "Naberezhna Zavods'ka St, 52, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000",
 "Naberezhna Zavods'ka St, 70, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000"
 ],
 "origin_addresses" : [
 "Dmytra Yavornytskoho Avenue, 59А, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000"
 ],
 "rows" : [
 {
 "elements" : [
 {
 "distance" : {
 "text" : "0.5 km",
 "value" : 547
 },
 "duration" : {
 "text" : "4 mins",
 "value" : 213
 },
 "status" : "OK"
 },
 {
 "distance" : {
 "text" : "0.6 km",
 "value" : 573
 },
 "duration" : {
 "text" : "2 mins",
 "value" : 139
 },
 "status" : "OK"
 },
 {
 "distance" : {
 "text" : "0.9 km",
 "value" : 909
 },
 "duration" : {
 "text" : "4 mins",
 "value" : 213
 },
 "status" : "OK"
 },
 {
 "distance" : {
 "text" : "1.3 km",
 "value" : 1302
 },
 "duration" : {
 "text" : "5 mins",
 "value" : 287
 },
 "status" : "OK"
 },
 {
 "distance" : {
 "text" : "1.9 km",
 "value" : 1937
 },
 "duration" : {
 "text" : "6 mins",
 "value" : 334
 },
 "status" : "OK"
 },
 {
 "distance" : {
 "text" : "2.5 km",
 "value" : 2517
 },
 "duration" : {
 "text" : "6 mins",
 "value" : 381
 },
 "status" : "OK"
 },
 {
 "distance" : {
 "text" : "3.2 km",
 "value" : 3249
 },
 "duration" : {
 "text" : "7 mins",
 "value" : 433
 },
 "status" : "OK"
 },
 {
 "distance" : {
 "text" : "4.9 km",
 "value" : 4875
 },
 "duration" : {
 "text" : "9 mins",
 "value" : 548
 },
 "status" : "OK"
 },
 {
 "distance" : {
 "text" : "6.4 km",
 "value" : 6383
 },
 "duration" : {
 "text" : "11 mins",
 "value" : 630
 },
 "status" : "OK"
 },
 {
 "distance" : {
 "text" : "7.3 km",
 "value" : 7305
 },
 "duration" : {
 "text" : "11 mins",
 "value" : 676
 },
 "status" : "OK"
 }
 ]
 }
 ],
 "status" : "OK"
 }
 */

public class DistanceMatrixResponse {

    @SerializedName("destination_addresses")
    private List<String> destinationAddressesList;

    @SerializedName("origin_addresses")
    private List<String> originAddressesList;

    @SerializedName("rows")
    public List<Row> rows;


    public List<String > getAddressesList() {
        return (destinationAddressesList == null) ? destinationAddressesList = new ArrayList<>() : destinationAddressesList;
    }

    public String getOriginAddresses() {
        if (originAddressesList == null || originAddressesList.size() < 1)
            return "";
        return originAddressesList.get(0);
    }
}
