package com.company.javadaggermvpsample.second;

import javax.inject.Inject;

class SecondPresenter implements SecondContract.Presenter {

    @Inject
    SecondContract.View view;

    @Inject
    SecondPresenter() {
    }

    @Override
    public void showMessagePressed() {
        view.showToast("Hello from presenter");
    }

}
