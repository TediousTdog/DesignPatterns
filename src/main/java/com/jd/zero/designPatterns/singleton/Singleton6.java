package com.jd.zero.designPatterns.singleton;

public class Singleton6 {

    private static volatile Singleton6 SingletonInstance = null;

    private Singleton6(){};

    private static Singleton6 getInstance() {
        if (SingletonInstance == null){
            // 妄图通过减小同步代码块的方式提高效率 然后不可行
            synchronized (Singleton6.class){
                if (SingletonInstance == null)
                SingletonInstance = new Singleton6();
            }
        }
        return SingletonInstance;
    }

    public static void main(String[] args) {
        Singleton6 instance1 = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance1 == instance2);
    }

}
