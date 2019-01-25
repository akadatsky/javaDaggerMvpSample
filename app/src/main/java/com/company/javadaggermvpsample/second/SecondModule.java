package com.company.javadaggermvpsample.second;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class SecondModule {

    @Binds
    public abstract SecondContract.Presenter bindPresenter(SecondPresenter presenter);

    @Binds
    public abstract SecondContract.View bindView(SecondActivity view);

}
