package com.quanlt.boilerplate;

import android.app.Application;
import android.content.Context;
import android.support.annotation.VisibleForTesting;

import com.quanlt.boilerplate.di.component.ApplicationComponent;
import com.quanlt.boilerplate.di.component.DaggerApplicationComponent;
import com.quanlt.boilerplate.di.module.ApplicationModule;

/**
 * Created by quanlt on 24/01/2017.
 */

public class BoilerPlateApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static BoilerPlateApplication get(Context context) {
        return (BoilerPlateApplication) context.getApplicationContext();
    }

    public synchronized ApplicationComponent getComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return mApplicationComponent;

    }

    @VisibleForTesting
    public void setApplicationComponent(ApplicationComponent mApplicationComponent) {
        this.mApplicationComponent = mApplicationComponent;
    }
}
