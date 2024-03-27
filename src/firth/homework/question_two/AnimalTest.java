package firth.homework.question_two;

/**
 * 2. 编程实现如下场景描述：
 * > 温顺小羊爱吃草，
 * > 大眼小猫爱吃鱼，
 * > 小黄狗爱肉骨头。
 */
public class AnimalTest {
    public static void main(String[] args) {

        Sheep sheep = new Sheep();
        Cat cat = new Cat();
        Dog dog = new Dog();

        sheep.eating();
        cat.eating();
        dog.eating();

    }
}
