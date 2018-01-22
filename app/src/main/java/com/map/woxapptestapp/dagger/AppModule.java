package com.map.woxapptestapp.dagger;

import android.content.Context;

import com.map.woxapptestapp.retrofit.GoogleMapsApi;
import com.map.woxapptestapp.tools.SharedPrefManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.map.woxapptestapp.App.getAppContext;

/**
 * Created by i7-4770k on 19.01.2018
 */

@Module
public class AppModule {

    public static final String BASE_URL = "https://maps.googleapis.com/maps/api/";

    @Provides
    public Context context() {
        return getAppContext();
    }

    @Provides
    @Singleton
    SharedPrefManager getSharedPrefManager(Context context) {
        return new SharedPrefManager(context);
    }

    @Provides
    public Realm getRealm() {
        return Realm.getDefaultInstance();
    }

    @Provides
    @Singleton
    public GoogleMapsApi getRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build()
                .create(GoogleMapsApi.class);
    }

}
