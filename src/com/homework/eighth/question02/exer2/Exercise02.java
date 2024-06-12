package com.homework.eighth.question02.exer2;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/7
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * 2.使用String类的public char charAt(int index)方法可以得到当前字符串index位置上的一个字符。
 * 编写程序使用该方法得到一个字符串中的第一个和最后一个字符。
 */
public class Exercise02 {
    public static void main(String[] args) {
        String str = "Hello World";
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("The first character is " + firstChar);
        System.out.println("The last character is " + lastChar);
    }
}
