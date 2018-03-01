package com.mills.b.joshua.daggermvp;

/**
 * Created by Inferno on 2/28/2018.
 */

public interface LoginRepository {
    User getUser();

    void saveUser();
}
