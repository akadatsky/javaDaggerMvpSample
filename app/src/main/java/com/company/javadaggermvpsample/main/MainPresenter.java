package com.company.javadaggermvpsample.main;

import android.content.Context;
import android.content.Intent;

import com.company.javadaggermvpsample.second.SecondActivity;

import javax.inject.Inject;

class MainPresenter implements MainContract.Presenter {

    @Inject
    MainContract.View view;

    @Inject
    Context context;

    @Inject
    MainPresenter() {
    }

    @Override
    public void nextPressed() {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}
