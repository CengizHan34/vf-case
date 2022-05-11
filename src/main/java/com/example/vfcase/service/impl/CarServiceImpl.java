package com.example.vfcase.service.impl;

import com.example.vfcase.enums.CarType;
import com.example.vfcase.service.Car;
import com.example.vfcase.service.CarService;
import org.springframework.stereotype.Service;

/**
 * @author created by cengizhan on 11.05.2022
 */
@Service
public class CarServiceImpl implements CarService {
    @Override
    public Car createCar(CarType type) {
        return Car.createCar(type);
    }
}
