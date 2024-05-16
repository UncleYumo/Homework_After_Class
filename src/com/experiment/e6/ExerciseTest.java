package com.experiment.e6;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/16
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * 1.字符串调用public String toUpperCase(）方法返回一个字符串，该字符串把当前字符串中的小写字母变成大写字母；
 *     字符串调用public String toLowerCase(）方法返回一个字符串，该字符串把当前字符串中的大写字母变成小写字母；
 * String类的 public Stringconcat(String str）方法返回一个字符串，该字符串是把调用该方法的字符串与参数指定的字符串连接。
 *     编写一个程序，练习使用这3个方法。
 * 2.使用String 类的public char charAt(int index)方法可以得到当前字符串index位置上的一个字符。
 *     编写一个程序编写程序使用该方法得到一个字符串中的第一个和最后一个字符。
 * 3.计算某年某月某日和某年某月某日之间的天数间隔，要求年、月、日使用main方法的参数传递到程序中。
 * 4.编程练习Math类的常用方法。
 * 5.编写程序去除一个字符串中的全部非数字字符，例如将形如“ab123you”的非数字字符，全部去除，得到字符串“123”（参看例子10）。
 * 6.使用Scanncr类的实例解析字符串“数学87分，物理76分，英语96分“中的考试成绩。并计算出总成绩以及平均分数（参看例子13）。
 */
public class ExerciseTest {
    public static void main(String[] args) {
        ExerciseMain exerMain = new ExerciseMain();
        System.out.println("第一题：");
        exerMain.turnUpperCase("hello,world");
        exerMain.turnLowerCase("HELLO,WORLD");
        exerMain.concatString("hello", "world");
        System.out.println("第二题：");
        exerMain.getFirstAndLastChar("hello,world");
        System.out.println("第三题：");
        exerMain.daysBetween(2022, 1, 1, 2022, 2, 28);
        exerMain.daysBetween(2022, 1, 1, 2023, 2, 28);
        exerMain.daysBetween(2022, 1, 1, 2023, 1, 1);
        exerMain.daysBetween(2022, 1, 1, 2022, 1, 31);
        exerMain.daysBetween(2022, 1, 1, 2022, 2, 29);
        System.out.println("第四题：");
        exerMain.mathMethod();
        System.out.println("第五题：");
        exerMain.removeNonDigit("ab123you");
        exerMain.removeNonDigit("123456");
        System.out.println("第六题：");
        exerMain.calculateScore();
    }
}
class ExerciseMain {
    public void turnUpperCase(String str) {
        String upperStr = str.toUpperCase();
        System.out.println("原字符串：" + str + "，转化为大写：" + upperStr);
    }

    public void turnLowerCase(String str) {
        String lowerStr = str.toLowerCase();
        System.out.println("原字符串：" + str + "，转化为小写：" + lowerStr);
    }

    //String类的 public String concat(String str）方法返回一个字符串，该字符串是把调用该方法的字符串与参数指定的字符串连接。
    public void concatString(String str1, String str2) {
        String result = str1.concat(str2);
        System.out.println("原字符串1：" + str1 + "，原字符串2：" + str2 + "，连接后的字符串：" + result);
    }

    // 使用String 类的public char charAt(int index)方法可以得到当前字符串index位置上的一个字符。
    // 编写一个程序编写程序使用该方法得到一个字符串中的第一个和最后一个字符。
    public void getFirstAndLastChar(String str) {
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("字符串：" + str + "，第一个字符：" + firstChar + "，最后一个字符：" + lastChar);
    }

    // 计算某年某月某日和某年某月某日之间的天数间隔，要求年、月、日使用main方法的参数传递到程序中。
    public void daysBetween(int year1, int month1, int day1, int year2, int month2, int day2) {
        int days = 0;
        // 计算间隔年
        for (int i = year1; i < year2; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) { // 判断是否为闰年
                days += 366;
            } else {
                days += 365;
            }
        }
        // 计算间隔月
        for (int i = month1; i < month2; i++) {
            if (i == 2) { // 判断是否为2月
                if (year1 % 4 == 0 && (year1 % 100 != 0 || year1 % 400 == 0)) { // 判断是否为闰年
                    days += 29;
                } else {
                    days += 28;
                }
            } else if (i == 4 || i == 6 || i == 9 || i == 11) { // 判断是否为30天的月份
                days += 30;
            } else { // 其他月份为31天
                days += 31;
            }
            // 计算间隔天数
            days += (day2 - day1);
            System.out.println("两日期间隔的天数：" + days);
        }
    }

    // 编写程序去除一个字符串中的全部非数字字符，例如将形如“ab123you”的非数字字符，全部去除，得到字符串“123”（参看例子10）。
    public void removeNonDigit(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        System.out.println("原字符串：" + str + "，去除非数字字符后的字符串：" + result);
    }

    // 编写程序使用Scanncr类的实例解析字符串“数学87分，物理76分，英语96分“中的考试成绩。并计算出总成绩以及平均分数（参看例子13）。
    public void calculateScore() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] subjects = {"数学", "物理", "英语"};
        int totalScore = 0;
        int count = 0;

        String[] scoreStr = str.split("，");
        for (String s : scoreStr) {
            for (int i = 0; i < subjects.length; i++) {
                if (s.contains(subjects[i])) { // 检查字符串中是否包含科目
                    int score = Integer.parseInt(s.replaceAll("\\D", "")); // 提取数字并转换为整数
                    totalScore += score;
                    count++;
                    break;
                }
            }
        }
        double averageScore = (double) totalScore / count;
        System.out.println("总成绩：" + totalScore + "，平均分数：" + averageScore);
    }

    public void mathMethod() {
        System.out.println("Math.PI：" + Math.PI); // 圆周率
        System.out.println("Math.E：" + Math.E); // 自然常数
        System.out.println("Math.abs(-10)：" + Math.abs(-10)); // 绝对值
        System.out.println("Math.ceil(3.5)：" + Math.ceil(3.5)); // 向上取整
        System.out.println("Math.floor(3.5)：" + Math.floor(3.5)); // 向下取整
    }
}