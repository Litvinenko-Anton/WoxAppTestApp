package com.map.woxapptestapp.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;

import com.arellomobile.mvp.MvpAppCompatFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by Anton on 23.05.2017
 */

public class BaseFragment extends MvpAppCompatFragment {

    protected Unbinder mUnbinder;

    protected void bindButterKnife(@NonNull Fragment fragment, View mView) {
        mUnbinder = ButterKnife.bind(fragment, mView);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        if (mUnbinder != null)
            mUnbinder.unbind();
        super.onDestroy();
    }

    public void stopOurSelf() {
        getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
    }

}
