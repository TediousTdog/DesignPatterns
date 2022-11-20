package com.jd.zero.designPatterns.singleton;

public class Singleton2 {

    private static final Singleton2 SingletonInstance;

    static {
        SingletonInstance = new Singleton2();
    }
    private Singleton2(){};

    private static Singleton2 getInstance() {
        return SingletonInstance;
    }

    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
    }

}
