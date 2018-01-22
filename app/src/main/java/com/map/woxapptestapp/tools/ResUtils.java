package com.map.woxapptestapp.tools;

import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.Dimension;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

import static com.map.woxapptestapp.App.getAppContext;

/**
 * Created by Anton on 16.11.2017
 */

public class ResUtils {

    @NonNull
    public static String getStringRes(@StringRes int id) {
        return getAppContext().getResources().getString(id);
    }

    public static Drawable getDrawableRes(@DrawableRes int id) {
        return ContextCompat.getDrawable(getAppContext(), id);
    }

    public static BitmapDescriptor getBitmapDescriptorRes(@DrawableRes int id) {
        return BitmapDescriptorFactory.fromResource(id);
    }

    public static @ColorInt
    int getColorIntRes(@ColorRes int id) {
        return ContextCompat.getColor(getAppContext(), id);
    }

    public static @Dimension
    int getDimensRes(@DimenRes int id) {
        return getAppContext().getResources().getDimensionPixelSize(id);
    }

}
