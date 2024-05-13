package com.experiment.e5;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/8
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * 编写模拟器类Simulator，该类有一个playSound(Animal an)方法，该方法的参数为Animal类型，
 * 则an可以调用实现Animal接口类重写的cry()方法播放具体动物的声音，
 * 调用重写的getAnimalName()方法显示具体动物种类的名称。
 */
public class Simulator implements Animal{

    @Override
    public String getAnimalName() {
        return null;
    }

    @Override
    public void cry() {
        System.out.println(getAnimalName() + "发出哭声");
    }

    public void playSound(Animal an) {
        an.cry();
    }
}
