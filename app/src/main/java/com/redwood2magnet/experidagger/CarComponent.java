package com.redwood2magnet.experidagger;

import javax.inject.Inject;

import dagger.Component;

@Component(modules = {CarModule.class })
public interface CarComponent {

    Car getMyCar();

    //void carInjector(MainActivity mainActivity);
}
