package com.homework.eighth.question02.exer1;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/7
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * 1.字符串调用public String toUpperCase(）方法返回一个字符串，该字符串把当前字符串中的小写字母变成大写字母；
 * 字符串调用public String toLowerCase(）方法返回一个字符串，该字符串把当前字符串中的大写字母变成小写字母；
 * String 类的 public String concat（String str)方法返回一个字符串，该字符串是把调用该方法的字符串与参数指定的字符串连接。
 * 编写一个程序，练习使用这3个方法。
 */
public class Exercise01 {
    public static void main(String[]args) {
        String str1 = "sadcjabscakecnekjc";
        String str2 = "SJSBXCISBXCAKJBCAJ";
        String str3 = "Hello";

        String upperStr = str1.toUpperCase();
        String lowerStr = str2.toLowerCase();
        String concatStr = str3.concat(" World!");

        System.out.println("Original String: " + str1);
        System.out.println("Uppercase String: " + upperStr);
        System.out.println("Original String: " + str2);
        System.out.println("Lowercase String: " + lowerStr);
        System.out.println("Original String: " + str3);
        System.out.println("Concatenated String: " + concatStr);
    }
}
