package com.hanshunping._list;

import com.review.programming.progrom.Color_Print_Utils;

import java.util.HashSet;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/13
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class Main {
    public static void main(String[] args) {
        Color_Print_Utils.getInstance().printlnPurple("-------------------program start-------------------");
        HashSet set = new HashSet();
        set.add(new Class("c1"));
        set.add(new Class("c2"));
        set.add(new Class("c3"));
        set.add(new Class("c1"));
        set.add("c1");
        set.add(120);
        Color_Print_Utils.getInstance().printlnYellow(String.valueOf(set));
    }
}

class Class {
    String name;
    public Class(String name) {
        this.name = name;
    }
    public void method() {
        System.out.println("this is a class method");
    }
    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                '}';
    }
}
