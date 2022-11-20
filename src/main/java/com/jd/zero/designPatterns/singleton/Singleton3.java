package com.jd.zero.designPatterns.singleton;

public class Singleton3 {

    private static Singleton3 SingletonInstance = null;

    private Singleton3(){};

    private static Singleton3 getInstance() {
        if (SingletonInstance == null){
            SingletonInstance = new Singleton3();
        }
        return SingletonInstance;
    }

    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
    }

}
