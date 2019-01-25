package com.company.javadaggermvpsample.di;

import com.company.javadaggermvpsample.main.MainActivity;
import com.company.javadaggermvpsample.main.MainModule;
import com.company.javadaggermvpsample.second.SecondActivity;
import com.company.javadaggermvpsample.second.SecondModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector(modules = SecondModule.class)
    abstract SecondActivity secondActivity();

}
