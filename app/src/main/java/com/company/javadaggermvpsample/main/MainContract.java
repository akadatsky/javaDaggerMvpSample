package com.company.javadaggermvpsample.main;

import com.company.javadaggermvpsample.BasePresenter;
import com.company.javadaggermvpsample.BaseView;

public interface MainContract {

    interface View extends BaseView {
    }

    interface Presenter extends BasePresenter {
        void nextPressed();
    }

}
