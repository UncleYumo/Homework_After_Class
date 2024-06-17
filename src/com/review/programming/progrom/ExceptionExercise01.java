package com.review.programming.progrom;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author uncle_yumo
 * @CreateDate 2024/6/16
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class ExceptionExercise01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BelovedPerson bp = new BelovedPerson();

        while (true) {
            try {
                Color_Print_Utils.getInstance().printlnCyan("请输入你女朋友的名字哟：");
                String name = scan.nextLine();
                bp.setName(name);
                Color_Print_Utils.getInstance().printlnCyan("请输入你女朋友地方年龄：");
                int age = Integer.parseInt(scan.nextLine());
                bp.setAge(age);
                Color_Print_Utils.getInstance().printlnGreen("输入成功！");
                break;
            } catch (NumberFormatException e) {
                Color_Print_Utils.getInstance().printlnPurple("年龄格式有误，请输入数字！");
            } catch (RuntimeException e) {
                Color_Print_Utils.getInstance().printlnPurple(e.getMessage());
            }
        }
        Color_Print_Utils.getInstance().printlnCyanBlack(bp.toString());
    }
}

class BelovedPerson {
    private String name;
    private int age;

    public void setName(String name) {
        int len = name.length();
        if (len < 3 || len > 10) {
            throw new RuntimeException("异常：姓名长度不符合标准！");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 18 || age > 40) {
            throw new RuntimeException("异常：年龄不符合标准！");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "所心仪的女生信息：" +
                this.name +
                "\t" +
                this.age +
                "岁";
    }
}