package com.homework.sixth;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/20
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Simulator implements Animal{

    public void playSound(Animal animal) {
        animal.cry();
    }

    @Override
    public void cry() {

    }

    @Override
    public String getAnimalName() {
        return null;
    }
}
