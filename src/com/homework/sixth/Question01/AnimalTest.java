package com.homework.sixth.Question01;

public class AnimalTest {
    public static void main(String[] args) {

        Cat cat01 = new Cat("Cat01");
        Cat cat02 = new Cat("Cat02");

        Dog dog01 = new Dog("Dog01");
        Dog dog02 = new Dog("Dog02");

        System.out.println("First cat's name is : " + cat01.getAnimalName());
        cat01.cryOfCat();

        System.out.println("Second cat's name is : " + cat02.getAnimalName());
        cat02.cryOfCat();

        System.out.println("First dog's name is : " + dog01.getAnimalName());
        dog01.cryOfDog();

        System.out.println("Second dog's name is : " + dog02.getAnimalName());
        dog02.cryOfDog();


    }
}
