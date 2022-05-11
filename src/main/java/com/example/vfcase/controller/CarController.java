package com.example.vfcase.controller;

import com.example.vfcase.enums.CarType;
import com.example.vfcase.service.Car;
import com.example.vfcase.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author created by cengizhan on 11.05.2022
 */
@RestController
@RequestMapping("/api/car")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody CarType type){
        Car car = carService.createCar(type);
        return ResponseEntity.ok().body(car.getType());
    }
}
