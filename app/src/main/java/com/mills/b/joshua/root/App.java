package com.mills.b.joshua.root;

import android.app.Application;

import com.mills.b.joshua.daggermvp.LoginModule;

/**
 * Created by Inferno on 2/28/2018.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public  void onCreate(){
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
