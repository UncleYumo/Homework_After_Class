package com.experiment.e5;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/8
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Cat implements Animal {
    @Override
    public void cry() {
        System.out.println("喵喵喵...");
    }

    @Override
    public String getAnimalName() {
        return this.getClass().getSimpleName();
    }
}
