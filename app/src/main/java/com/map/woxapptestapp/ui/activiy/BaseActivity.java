package com.map.woxapptestapp.ui.activiy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends MvpAppCompatActivity {

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mUnbinder = ButterKnife.bind(bindButterKnife());
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        unbindButterKnife();
        super.onDestroy();
    }

    protected abstract Activity bindButterKnife();

    protected void unbindButterKnife() {
        if (mUnbinder != null)
            mUnbinder.unbind();
    }

    protected void nextActivity(Intent activityIntent) {
        startActivity(activityIntent);
    }

}
