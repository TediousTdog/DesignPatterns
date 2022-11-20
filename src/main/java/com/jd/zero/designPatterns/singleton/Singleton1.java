package com.jd.zero.designPatterns.singleton;

public class Singleton1{

    private static final Singleton1 SingletonInstance = new Singleton1();

    private Singleton1(){};

    private static Singleton1 getInstance() {
        return SingletonInstance;
    }

    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
    }

}
