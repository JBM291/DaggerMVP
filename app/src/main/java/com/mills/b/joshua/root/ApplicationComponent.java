package com.mills.b.joshua.root;

import com.mills.b.joshua.daggermvp.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Inferno on 2/28/2018.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(LoginActivity target);
}
