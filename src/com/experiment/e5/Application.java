package com.experiment.e5;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/8
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Application {
    public static void main(String[] args) {
        Simulator sm = new Simulator();
        sm.playSound(new Dog());
        sm.playSound(new Cat());
    }
}
