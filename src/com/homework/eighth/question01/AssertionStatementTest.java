package com.homework.eighth.question01;

import java.util.Scanner;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/7
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * 五、编程题
 * 第3章中例子9的程序允许用户在键盘上依次输入若干个数字（每输入一个数字都需要按回车确认），程序将计算出这些数的和以及平均值。
 * 请在第3章的例子9中增加断言语句，当用户输入的数字大于100或小于0时程序立刻终止执行，并提示这是一个非法的成绩数据。
 */
public class AssertionStatementTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0.0;
        boolean isFlag = true;
        String input = ""; // 当用户输入为q时，程序终止执行

        while (isFlag) {
            System.out.print("请输入一个数字（输入q结束程序）：");
            input = scanner.next();
            if(input.equals("q")) {
                isFlag = false;
            }else {
                // 增加断言语句, 当用户输入的数字大于100或小于0时程序立刻终止执行，并提示这是一个非法的成绩数据
                int tempInput = Integer.parseInt(input);
                assert tempInput <=100 && tempInput >=0 : "这是一个非法的成绩数据";

                sum += tempInput;
                count++;
                average = (double) sum / count;
                System.out.println("当前的总和为：" + sum);
                System.out.println("当前的平均值为：" + average);
            }

        }
        scanner.close(); // 关闭Scanner对象
        System.out.println("程序执行完毕！");
    }
}
