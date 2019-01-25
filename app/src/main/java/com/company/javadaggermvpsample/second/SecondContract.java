package com.company.javadaggermvpsample.second;

import com.company.javadaggermvpsample.BasePresenter;
import com.company.javadaggermvpsample.BaseView;

public interface SecondContract {

    interface View extends BaseView {
        void showToast(String text);
    }

    interface Presenter extends BasePresenter {
        void showMessagePressed();
    }

}
