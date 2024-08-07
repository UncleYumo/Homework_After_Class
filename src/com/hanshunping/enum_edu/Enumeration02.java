package com.hanshunping.enum_edu;

import com.review.programming.progrom.Color_Print_Utils;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/4
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class Enumeration02 {
    public static void main(String[] args) {
        Color_Print_Utils.getInstance().printlnYellow(Season_enum.SPRING.toString());
    }
}
enum Season_enum {

    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冰雪消融");
    private String name;
    private String desc;

    private Season_enum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season_enum{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

