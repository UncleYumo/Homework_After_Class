package com.experiment.e5;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/8
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Dog implements Animal{

    @Override
    public void cry() {
        System.out.println("Woof!");
    }

    @Override
    public String getAnimalName() {
        return this.getClass().getSimpleName();
    }
}
