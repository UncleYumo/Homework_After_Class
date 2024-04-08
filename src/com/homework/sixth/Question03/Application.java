package com.homework.sixth.Question03;

import com.homework.sixth.Question01.Cat;
import com.homework.sixth.Question01.Dog;
import com.homework.sixth.Question02.Simulator;

/**
 * ## 第四题
 * **编写主类 Application(用户程序)**
 * <br />
 * 在主类Application的`main方法`中至少包含如下代码:
 * <br />
 * ```
 * Simulator simulator = new Simulator();
 * simulator.playSound(new Dog());
 * simulator.playSound(new Cat());
 * ```
 */
public class Application {
    public static void main(String[] args) {

         Simulator simulator = new Simulator();
         simulator.playSound(new Dog());
         simulator.playSound(new Cat());

    }
}
