package com.homework.fifth.Question02;

import com.homework.fifth.Question01.Cat;
import com.homework.fifth.Question01.Dog;


public class SimulatorTest {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();

        Cat cat01 = new Cat("Cat01");
        Cat cat02 = new Cat("Cat02");

        Dog dog01 = new Dog("Dog01");
        Dog dog02 = new Dog("Dog02");

        simulator.playSound(cat01);
        simulator.playSound(cat02);
        simulator.playSound(dog01);
        simulator.playSound(dog02);
    }
}
