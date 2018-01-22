package com.map.woxapptestapp.tools;

import android.view.View;
import android.view.ViewTreeObserver;

/**
 * Created by Anton on 07.08.2016
 */

public class ViewUtils {

    protected ViewUtils() {

    }

    public static boolean isVisibleView(final View view) {
        return (view != null && view.getVisibility() == View.VISIBLE);
    }

    public static boolean setVisibleView(final View view) {
        if (view != null && view.getVisibility() != View.VISIBLE) {
            view.setVisibility(View.VISIBLE);
            return true;
        }
        return false;
    }

    public static boolean setVisibleView(final View... views) {
        if (views == null || views.length == 0) return false;
        for (View view : views)
            setVisibleView(view);
        return true;
    }

    public static boolean setInvisibleView(final View view) {
        if (view != null && view.getVisibility() != View.INVISIBLE) {
            view.setVisibility(View.INVISIBLE);
            return true;
        }
        return false;
    }

    public static boolean setInvisibleView(final View... views) {
        if (views == null || views.length == 0) return false;
        for (View view : views)
            setInvisibleView(view);
        return true;
    }

    public static boolean setGoneView(final View view) {
        if (view != null && view.getVisibility() != View.GONE) {
            view.setVisibility(View.GONE);
            return true;
        }
        return false;
    }

    public static boolean setGoneView(final View... views) {
        if (views == null || views.length == 0) return false;
        for (View view : views)
            setGoneView(view);
        return true;
    }

    public static boolean setVisibleOrInvisibleView(final View view, final boolean isVisible) {
        if (view != null) {
            if (isVisible) {
                return setVisibleView(view);
            } else {
                return setInvisibleView(view);
            }
        }
        return false;
    }

    public static boolean setVisibleOrGoneView(final View view, final boolean isVisible) {
        if (view != null) {
            if (isVisible) {
                return setVisibleView(view);
            } else {
                return setGoneView(view);
            }
        }
        return false;
    }

    public static boolean replaceInvisibleView(final View visibleView, final View invisibleView) {
        return (setVisibleView(visibleView) | setInvisibleView(invisibleView));
    }

    public static boolean replaceGoneView(final View visibleView, final View goneView) {
        return (setVisibleView(visibleView) | setGoneView(goneView));
    }

    public static void waitMeasure(final View view, final OnMeasuredCallback callback) {
        int width = view.getWidth();
        int height = view.getHeight();

        if(width > 0 && height > 0) {
            callback.onMeasured(view, width, height);
            return;
        }

        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                final ViewTreeObserver observer = view.getViewTreeObserver();
                if(observer.isAlive())
                    observer.removeOnPreDrawListener(this);

                callback.onMeasured(view, view.getWidth(), view.getHeight());
                return true;
            }
        });
    }

    /**
     * Interface
     */

    public interface OnMeasuredCallback {
        void onMeasured(View view, int width, int height);
    }
}
