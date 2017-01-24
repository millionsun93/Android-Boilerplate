package com.quanlt.boilerplate.di.component;


import com.quanlt.boilerplate.di.PerActivity;
import com.quanlt.boilerplate.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by quanlt on 19/01/2017.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {


}
