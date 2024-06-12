package com.homework.sixth;


/**
 * @author uncle_yumo
 * @CreateDate 2024/4/20
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Dog implements Animal{
    private String name = "undefined";
    private int age;
    public Dog() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void cry() {
        System.out.println("小狗" + getName() + "正在哭泣");
    }

    @Override
    public String getAnimalName() {
        return name;
    }
}
