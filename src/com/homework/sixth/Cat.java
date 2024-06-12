package com.homework.sixth;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/20
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Cat implements Animal {
    private String name = "undefined";
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public void cry() {
        System.out.println("小猫" + getName() + "正在哭泣");
    }

    @Override
    public String getAnimalName() {
        return getName();
    }
}
