package com.quanlt.boilerplate.ui.base;

import android.support.v7.app.AppCompatActivity;

import com.quanlt.boilerplate.BoilerPlateApplication;
import com.quanlt.boilerplate.di.component.ActivityComponent;
import com.quanlt.boilerplate.di.component.DaggerActivityComponent;


/**
 * Created by quanlt on 24/01/2017.
 */

public class BaseActivity extends AppCompatActivity {
    private ActivityComponent mActivityComponent;

    public ActivityComponent getActivityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .applicationComponent(BoilerPlateApplication.get(this).getComponent())
                    .build();
        }
        return mActivityComponent;
    }
}
