package com.apps.malpv.casadagger;

import com.apps.malpv.casadagger.model.Casa;

import dagger.Component;

@Component
public interface AppComponent {
    Casa getCasa();
}
