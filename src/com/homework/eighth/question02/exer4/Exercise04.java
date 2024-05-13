package com.homework.eighth.question02.exer4;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/7
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * 4.编写程序，利用正则表达式去除一个字符串中的全部非数字字符，例如将形如“ab123you”的非数字字符全部去除，得到字符串“123”;
 */
public class Exercise04 {
    public static void main(String[] args) {
        String str = "ab123you";
        String result = "";
        result = str.replaceAll("[^\\d]", "");
        System.out.println(result);

    }
}
