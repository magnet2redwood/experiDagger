package com.redwood2magnet.experidagger;

import android.util.Log;

import javax.inject.Inject;

public class Engine {
    String mymsg= "this is honda car engine";


    public Engine() {

    }

    String getMymsg(){
        Log.i("SUJAY", "getMymsg: ");
        return  mymsg;
    }

}
