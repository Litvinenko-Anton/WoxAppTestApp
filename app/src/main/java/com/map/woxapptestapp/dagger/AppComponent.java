package com.map.woxapptestapp.dagger;

import com.map.woxapptestapp.ui.activiy.MainPresenter;
import com.map.woxapptestapp.ui.fragment.HistoryFragmentPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by i7-4770k on 19.01.2018
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MainPresenter presenter);

    void inject(HistoryFragmentPresenter historyFragmentPresenter);
}
