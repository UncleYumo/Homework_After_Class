package com.homework.sixth;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/20
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
        System.out.println("传参后");
        simulator.playSound(new Dog("无锡",10));
        simulator.playSound(new Cat("大学",20));
    }
}
