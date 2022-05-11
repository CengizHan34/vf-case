package com.example.vfcase.service;

import com.example.vfcase.enums.CarType;
import com.example.vfcase.service.impl.Cabrio;
import com.example.vfcase.service.impl.CarServiceImpl;
import com.example.vfcase.service.impl.Sedan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

/**
 * @author created by cengizhan on 11.05.2022
 */
@ExtendWith(MockitoExtension.class)
public class CarServiceTest {
    private CarService target;

    @BeforeEach
    void init(){
        target = new CarServiceImpl();
    }

    @Test
    public void createCar_ifCarTypeIsSedan_sedanObjectMustReturn (){
        Car result = target.createCar(CarType.SEDAN);
        assertInstanceOf(Sedan.class, result);
        assertEquals("Sedan Car has produced.", result.getType());
    }


    @Test
    public void createCar_ifCarTypeIsCabrio_cabrioObjectMustReturn (){
        Car result = target.createCar(CarType.CABRIO);
        assertInstanceOf(Cabrio.class, result);
        assertEquals("Cabrio Car has produced.", result.getType());
    }
}
