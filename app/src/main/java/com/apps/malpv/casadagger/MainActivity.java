package com.apps.malpv.casadagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.apps.malpv.casadagger.model.Casa;
import com.apps.malpv.casadagger.model.Habitaciones;
import com.apps.malpv.casadagger.model.Puertas;
import com.apps.malpv.casadagger.model.Ventanas;

public class MainActivity extends AppCompatActivity {

    private Casa casa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Puertas puertas = new Puertas();
        Ventanas ventanas = new Ventanas();
        Habitaciones habitaciones = new Habitaciones();
        Casa casa = new Casa(puertas, ventanas, habitaciones);
        casa.construir();
       */

        AppComponent component = DaggerAppComponent.create();

        casa = component.getCasa();
        casa.construir();

        Casa casaGrande = component.getCasa();
        casaGrande.construir();

    }
}
