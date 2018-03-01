package com.mills.b.joshua.daggermvp;

/**
 * Created by Inferno on 2/28/2018.
 */

public interface LoginActivityMVP {
    interface View{
        String getFirstName();
        String getLastName();

        void showUserNotAvailable();
        void showInputError();
        void showUserSavedMessage();

        void setFirstName(String fname);
        void setLastName(String lname);

    }

    interface Presenter{

    }

    interface Model{

    }
}
