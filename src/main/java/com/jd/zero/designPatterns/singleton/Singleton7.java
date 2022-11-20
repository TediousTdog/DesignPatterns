package com.jd.zero.designPatterns.singleton;

public class Singleton7 {

    private Singleton7(){};

    private static class SingletonHolder{
        private static final Singleton7 SingletonInstance = new Singleton7();
    }
    private static Singleton7 getInstance() {

        return SingletonHolder.SingletonInstance;
    }

    public static void main(String[] args) {
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance1 == instance2);
    }

}
