package com.jd.zero.designPatterns.singleton;

public class Singleton5 {

    private static Singleton5 SingletonInstance = null;

    private Singleton5(){};

    private static Singleton5 getInstance() {
        if (SingletonInstance == null){
            // 妄图通过减小同步代码块的方式提高效率 然后不可行
            synchronized (Singleton5.class){
                SingletonInstance = new Singleton5();
            }
        }
        return SingletonInstance;
    }

    public static void main(String[] args) {
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
    }

}
