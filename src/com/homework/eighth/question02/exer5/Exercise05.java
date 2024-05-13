package com.homework.eighth.question02.exer5;

import java.util.Scanner;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/7
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * 5.使用Scanner 类的实例解析字符串“数学87分，物理76分，英语96分"中的考试成绩，
 * 并计算出总成绩以及平均分数（参看例子13）。
 */
public class Exercise05 {
    public static void main(String[] args) {
        String input = "数学87分，物理76分，英语96分";

        double sum = 0;

        sum = GetPrice.getPrice(input);

        System.out.println("总成绩：" + sum);
        System.out.println("平均分数：" + sum / 3);
    }
}
