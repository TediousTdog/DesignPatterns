package com.jd.zero.designPatterns.factory;

public class Main {
    public static void main(String[] args) {
        Moveable moveable = new Plane();
        moveable.go();
    }
}
