package com.jd.zero.designPatterns.factory.simpleFactory;

import com.jd.zero.designPatterns.factory.Car;
import com.jd.zero.designPatterns.factory.Plane;

public class PlaneFactory {
    public Plane create(){
        // 增加各种增强
        return new Plane();
    }

}
