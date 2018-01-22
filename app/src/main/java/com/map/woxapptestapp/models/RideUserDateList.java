package com.map.woxapptestapp.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class RideUserDateList {

    private List<RideUserData> addresses = new ArrayList<>();

    public List<RideUserData> getAddresses() {
        return addresses;
    }

    public void add(RideUserData address) {
        this.addresses.add(address);
    }
}
