package com.map.woxapptestapp.ui.activiy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.AnimRes;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.view.inputmethod.InputMethodManager;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.map.woxapptestapp.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends MvpAppCompatActivity {

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onDestroy() {
        unbindButterKnife();
        super.onDestroy();
    }

    protected void bindButterKnife(Activity activity) {
        if (activity != null)
            mUnbinder = ButterKnife.bind(activity);
    }

    protected void unbindButterKnife() {
        if (mUnbinder != null)
            mUnbinder.unbind();
    }

    protected boolean hideKeyBoard() {
        if (getCurrentFocus() != null) {
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            return true;
        }
        return false;
    }

    public void startFragmentHistory(android.support.v4.app.Fragment fragment,@IdRes int containerViewId, String TAG) {
        startFragmentAddStack(
                        fragment,
                        containerViewId,
                        TAG,
                        R.anim.enter_from_right,
                        R.anim.exit_to_right);
    }

    private void startFragmentAddStack(Fragment fragment, @IdRes int containerViewId, String TAG, @AnimRes int enter, @AnimRes int exit) {
        if (fragment != null && TAG != null && getSupportFragmentManager().findFragmentByTag(TAG) == null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(enter, exit, enter, exit)
                    .replace(containerViewId, fragment, TAG)
                    .addToBackStack(TAG)
                    .commit();
        }
    }

}
