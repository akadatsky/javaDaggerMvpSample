package com.company.javadaggermvpsample.second;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.company.javadaggermvpsample.R;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class SecondActivity extends DaggerAppCompatActivity implements SecondContract.View {

    @Inject
    SecondContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.showMessage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.showMessagePressed();
            }
        });
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

}
