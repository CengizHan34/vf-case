package com.example.vfcase.service.impl;

import com.example.vfcase.service.Car;

/**
 * @author created by cengizhan on 11.05.2022
 */
public class Hatchback implements Car {
    private Hatchback() {
    }

    @Override
    public String getType() {
        return "Hatchback Car has produced.";
    }

    public static Hatchback create(){
        return new Hatchback();
    }
}
