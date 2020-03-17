package com.apps.malpv.casadagger.model;

import android.util.Log;

import javax.inject.Inject;

public class Casa {

    private static final String TAG = "Casa";
    private Puertas puertas;
    private Ventanas ventanas;
    private Habitaciones habitaciones;

    @Inject
    public Casa(Puertas puertas, Ventanas ventanas, Habitaciones habitaciones){
        this.puertas = puertas;
        this.ventanas = ventanas;
        this.habitaciones = habitaciones;
    }
    public void construir(){
        Log.d(TAG, "Estamos construyendo la casa");
        habitaciones.numeroHabitaciones();
    }
}
