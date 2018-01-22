package com.map.woxapptestapp.models;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class RideRealm extends RealmObject {

    @PrimaryKey
    private String id;

    private String address;

    private RealmList<AddressRealm> addresses;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RealmList<AddressRealm> getAddresses() {
        return addresses;
    }

    public void setAddresses(RealmList<AddressRealm> addresses) {
        this.addresses = addresses;
    }
}
