package com.jd.zero.designPatterns.singleton;

public class Singleton4 {

    private static Singleton4 SingletonInstance = null;

    private Singleton4(){};

    private static synchronized Singleton4 getInstance() {
        if (SingletonInstance == null){
            SingletonInstance = new Singleton4();
        }
        return SingletonInstance;
    }

    public static void main(String[] args) {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1 == instance2);
    }

}
