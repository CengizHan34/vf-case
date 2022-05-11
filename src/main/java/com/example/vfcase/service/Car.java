package com.example.vfcase.service;

import com.example.vfcase.enums.CarType;
import com.example.vfcase.service.impl.Cabrio;
import com.example.vfcase.service.impl.Sedan;

/**
 * @author created by cengizhan on 11.05.2022
 */
public interface Car {
    String getType();

    static Car createCar(CarType type){
        if (CarType.SEDAN == type) return Sedan.create();
        else if (CarType.CABRIO == type) return Cabrio.create();
        else return Sedan.create();
    }
}
