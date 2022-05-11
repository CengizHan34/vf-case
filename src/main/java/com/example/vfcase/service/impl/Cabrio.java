package com.example.vfcase.service.impl;

import com.example.vfcase.service.Car;
import org.springframework.stereotype.Service;

/**
 * @author created by cengizhan on 11.05.2022
 */
@Service
public class Cabrio implements Car {
    private Cabrio() {
    }

    @Override
    public String getType() {
        return "Cabrio Car has produced.";
    }

    public static Cabrio create(){
        return new Cabrio();
    }
}
