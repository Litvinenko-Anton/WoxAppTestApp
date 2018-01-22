package com.map.woxapptestapp;

import android.app.Application;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.arellomobile.mvp.MvpFacade;
import com.map.woxapptestapp.dagger.AppComponent;
import com.map.woxapptestapp.dagger.DaggerAppComponent;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by i7-4770k on 19.01.2018
 */

public class App extends Application {

    private static final String TAG = "DEBUG";
    private static final String MASSAGE_IS_NULL = "massage == null";

    private static Context context;

    private static AppComponent component;

    public static AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MvpFacade.init();
        context = getApplicationContext();

        initAppComponent();
//        initRealm();
    }

    public static Context getAppContext() {
        return context;
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

    public static void toastD(@Nullable String massage) {
        if (BuildConfig.DEBUG && context != null)
            Toast.makeText(context, (massage == null) ? MASSAGE_IS_NULL : massage, Toast.LENGTH_SHORT).show();
    }

    public static void toast(@Nullable String massage) {
        if (context != null)
            Toast.makeText(context, (massage == null) ? "" : massage, Toast.LENGTH_LONG).show();
    }

    public static void logD(@Nullable String message) {
        logD(TAG, message); // BLUE
    }

    public static void logD(@Nullable String tag, @Nullable String massage) {
        if (BuildConfig.DEBUG)
            Log.d((massage == null) ? TAG : tag,
                    (massage == null) ? MASSAGE_IS_NULL : massage);
    }
}
