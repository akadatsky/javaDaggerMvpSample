package com.company.javadaggermvpsample.main;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainModule {

    @Binds
    public abstract MainContract.Presenter bindPresenter(MainPresenter presenter);

    @Binds
    public abstract MainContract.View bindView(MainActivity view);

}
