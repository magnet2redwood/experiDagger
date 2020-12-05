package com.redwood2magnet.experidagger;


import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
public  Engine provideEngine(){
        Log.i("SUJAY", "provideEngine: ");
        return new Engine();
    }

    @Provides
    public Car provideCar(Engine engine){
        Log.i("SUJAY", "provideCar: ");
        return new Car(engine);
    }
}
