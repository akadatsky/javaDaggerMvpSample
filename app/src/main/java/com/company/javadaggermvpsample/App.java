package com.company.javadaggermvpsample;

import com.company.javadaggermvpsample.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class App extends DaggerApplication {

    @Override
    protected AndroidInjector<App> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }

}
