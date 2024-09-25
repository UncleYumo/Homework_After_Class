package com.hanshunping.single_;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/6
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("单例测试");
        Singleton02.getInstance();
    }
}

class Singleton01 {
    private static final Singleton01 instance = new Singleton01();  // 饿汉式单例模式
    private Singleton01(){}

    public static Singleton01 getInstance() {
        System.out.println("Call getInstance()");
        return instance;
    }

    public void getInstance_of_instance() {
        System.out.println("Call getInstance_of_instance()");
    }
}

class Singleton02 {
    private static Singleton02 instance;
    private Singleton02(){
        System.out.println("Call of Constructor");
    };

    public static Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
            System.out.println("Init Instance");
        }
        System.out.println("Get Instance");
        return instance;
    }

}