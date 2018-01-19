package com.map.woxapptestapp.ui.activiy;

import android.app.Activity;
import android.os.Bundle;

import com.map.woxapptestapp.R;
import com.map.woxapptestapp.ui.adapter.presentor.MainPresenter;

public class MainActivity extends BaseActivity implements MainPresenter.MainPresenterView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void responseComplete(boolean success) {

    }

    @Override
    public void responseError(String errorMessage) {

    }


    @Override
    protected Activity bindButterKnife() {
        return this;
    }
}
