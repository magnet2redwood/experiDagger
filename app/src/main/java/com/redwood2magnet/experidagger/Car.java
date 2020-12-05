package com.redwood2magnet.experidagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    Engine mEngine= new Engine();


    public Car(Engine mEngine) {
        this.mEngine = mEngine;
    }

    String getData(){
        Log.i("SUJAY", "getData: ");
        return mEngine.getMymsg();
    }
}
