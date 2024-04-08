package com.homework.sixth.Question01;

public class Dog extends Animal{
    public Dog() {
        super("Undefined Dog");
    }
    public Dog(String name) {
        super(name);
    }
    @Override
    public void cry() {
        System.out.println("健壮小狗在哭泣");
        System.out.println();
    }
}
