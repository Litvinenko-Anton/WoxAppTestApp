package com.map.woxapptestapp;

import android.app.Application;

import com.map.woxapptestapp.dagger.AppComponent;
import com.map.woxapptestapp.dagger.DaggerAppComponent;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class App extends Application {

    private static AppComponent component;

    public static AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initAppComponent();
        initRealm();
    }

    private void initAppComponent() {
        component = DaggerAppComponent.builder().build();
    }

    private void initRealm() {
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);
    }
}
