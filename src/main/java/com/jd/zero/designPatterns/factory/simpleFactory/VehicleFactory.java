package com.jd.zero.designPatterns.factory.simpleFactory;

import com.jd.zero.designPatterns.factory.Broom;
import com.jd.zero.designPatterns.factory.Car;

public class VehicleFactory {
    public Car createCar(){
        // 增加各种增强
        return new Car();
    }

    public Broom createBroom(){
        return new Broom();
    }
}
