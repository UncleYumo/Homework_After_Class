package com.homework.fifth.Question01;

public class Cat extends Animal{

    public Cat() {
        super("Undefined Cat");
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("可爱小猫正在哭泣");
        System.out.println();
    }

}
