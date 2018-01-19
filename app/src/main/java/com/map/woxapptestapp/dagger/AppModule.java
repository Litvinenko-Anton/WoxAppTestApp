package com.map.woxapptestapp.dagger;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by i7-4770k on 19.01.2018
 */

@Module
public class AppModule {

    @Provides
    public Realm getRealm() {
        return Realm.getDefaultInstance();
    }

}
