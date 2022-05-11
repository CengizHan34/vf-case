package com.example.vfcase.service;

import com.example.vfcase.enums.CarType;

/**
 * @author created by cengizhan on 11.05.2022
 */
public interface CarService {
    Car createCar(CarType type);
}
