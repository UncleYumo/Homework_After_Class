package com.hanshunping.enum_edu;

import com.review.programming.progrom.Color_Print_Utils;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/4
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class Enumeration01 {
    public static void main(String[] args) {
        Color_Print_Utils.getInstance().printlnCyan(Season.SPRING.toString());
    }
}
class Season {
    private String name;
    private String desc;

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season WINTER = new Season("冬天", "寒冷");

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

