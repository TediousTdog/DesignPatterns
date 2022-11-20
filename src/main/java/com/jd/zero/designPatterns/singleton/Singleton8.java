package com.jd.zero.designPatterns.singleton;

public enum  Singleton8 {

    INSTANCE;

    public static void main(String[] args) {
        Singleton8 instance1 = Singleton8.INSTANCE;
        Singleton8 instance2 = Singleton8.INSTANCE;
        System.out.println(instance1 == instance2);
    }

}
