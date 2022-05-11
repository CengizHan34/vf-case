package com.example.vfcase.service.impl;

import com.example.vfcase.service.Car;
import org.springframework.stereotype.Service;

/**
 * @author created by cengizhan on 11.05.2022
 */
@Service
public class Sedan implements Car {

    private Sedan() {
    }

    @Override
    public String getType() {
        return "Sedan Car has produced.";
    }

    public static Sedan create(){
        return new Sedan();
    }
}
