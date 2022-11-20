package com.jd.zero.designPatterns.factory.simpleFactory;

import com.jd.zero.designPatterns.factory.Car;

public class CarFactory {
    public Car create(){
        // 增加各种增强
        return new Car();
    }

}
