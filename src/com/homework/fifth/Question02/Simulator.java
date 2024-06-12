package com.homework.fifth.Question02;

import com.homework.fifth.Question01.Animal;
import com.homework.fifth.Question01.Dog;
import com.homework.fifth.Question01.Cat;

/**
 * ## 第二题
 * **编写模拟器类Simulator**
 * <br />
 * 该类有一个`playSound(Animal animal)`方法:
 * <br />
 * > 该方法的参数是Animal类型，即参数animal可以
 * 调用Animal的子类重写的`cry()`方法播放具体动物的声音，
 * 调用子类重写的```getAnimalName()```方法显示动物种类的名称
 */
public class Simulator {
    public void playSound(Animal animal) {
        System.out.println("The name of the animal is " + animal.getAnimalName());

        if (animal instanceof Cat) {
            animal = (Cat) animal;
            animal.cry();
        } else if (animal instanceof Dog) {
            animal = (Dog) animal;
            animal.cry();
        }
    }
}
