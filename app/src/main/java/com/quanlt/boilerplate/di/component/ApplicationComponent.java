package com.quanlt.boilerplate.di.component;

import android.app.Application;
import android.content.Context;


import com.quanlt.boilerplate.di.ApplicationContext;
import com.quanlt.boilerplate.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by quanlt on 19/01/2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @ApplicationContext
    Context context();

    Application application();

}
