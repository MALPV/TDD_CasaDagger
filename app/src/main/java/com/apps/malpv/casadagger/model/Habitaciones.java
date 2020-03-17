package com.apps.malpv.casadagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Habitaciones {

    private static final String TAG = "Casa";

    @Inject
    public Habitaciones(){
    }

    public void numeroHabitaciones(){
        Log.d(TAG, "Son 4 habitaciones");
    }
}
