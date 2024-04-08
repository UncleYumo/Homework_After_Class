package com.homework.sixth.Question01;

/**
 * ## 第一题
 * **编写抽象类 Animal**
 * <br />
 * Animal类有两个抽象方法:
 * > `cry()`和`getAnimalName()`
 * <br />
 * > 即: 要求各种具体的动物给出自己的叫声和种类名称。
 */
public abstract class Animal {
    private String name;

    public Animal() {
        this.name = "Undefined Animal";
    }
    public Animal(String name) {
        this.name = name;
    }
    public abstract void cry();

    public String getAnimalName() {
        return name;
    }

    public void cryOfCat() {
        System.out.println(getAnimalName() + " is cry (Cat)");
        System.out.println();
    }
    public void cryOfDog() {
        System.out.println(getAnimalName() + " is cry (Dog)");
        System.out.println();
    }
}
