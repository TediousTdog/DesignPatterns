package com.jd.zero.designPatterns.factory.abstractFactory;

import com.jd.zero.designPatterns.factory.Moveable;

public class Car implements Moveable {
    public void go(){
        System.out.println("car go");
    }
}
