package com.map.woxapptestapp.tools;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by CherryPie on 15.05.2017
 * For SAVE/READ in Shared Preferences
 * <p>
 * First need init in Application -> onCreate:
 * SharedPrefManager.getInstance().startConfig(context);
 * <p>
 * Then you can call getter/setter
 * SharedPrefManager.getInstance().getWatchingTutorial();
 */
public class SharedPrefManager implements CachedValue.Manager {

    public SharedPrefManager(Context context) {
        startConfig(context);
    }

    private static final String SHARED_PREFERENCES_NAME = "sharedPrefs"; // file name
    private static final String USER_DATA = "user_data";

    private Set<CachedValue> mCachedValues;

    //Accepts only String, Integer, Float, Long, Boolean.class
    private CachedValue<String> mUserData;

    @Override
    public void startConfig(Context context) {
        SharedPreferences mPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
        CachedValue.initialize(mPreferences);
        mCachedValues = new HashSet<>();
        mCachedValues.add(mUserData = new CachedValue<>(USER_DATA, "-1", String.class));
    }

    /**
     * Skip file to default
     */
    @Override
    public void clear() {  // skip file to default
        for (CachedValue value : mCachedValues) {
            value.delete();
        }
    }

    //-----------------------------------------------------------------------------------------//

    public void setUserData(Object userData) {
        String jsonString = new Gson().toJson(userData);
        this.mUserData.setValue(jsonString);
    }

    public <T> T getUserData(Class<T> userDataClassOfT) {
        T userData = null;

        String userDataString = mUserData.getValue();
        if (userDataString != null && !userDataString.equals("-1"))
            try {
                userData = new Gson().fromJson(userDataString, userDataClassOfT);
                return userData;
            } catch (JsonSyntaxException e) {
                e.printStackTrace();
            }

        try {
            userData = userDataClassOfT.newInstance();
            setUserData(userData);
            return userData;
        } catch (InstantiationException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("InstantiationException from userData.newInstance");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("IllegalAccessException from userData.newInstance");
        }
    }
}
