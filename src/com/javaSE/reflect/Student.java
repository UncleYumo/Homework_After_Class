package com.javaSE.reflect;

import com.review.programming.progrom.Color_Print_Utils;

/**
 * @author uncle_yumo
 * @fileName Student
 * @createDate 2024/9/28 September
 * @school 无锡学院
 * @studentID 22344131
 * @description
 * This is the class of Student,
 * which is used to represent a student in a school.
 */

public class Student {
    public String id = "20210001";
    private String name = "Tom";
    public int age = 20;

    private static final String className = "Student";

    public Student() {
        Color_Print_Utils.getInstance().printlnYellow("Student constructor without parameters is called.");
    }

    public Student(String id, String name, int age) {
        Color_Print_Utils.getInstance().printlnYellow("Student constructor with parameters is called.");
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, int age) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID | Name | Age --> " + id + " | " + name + " | " + age;
    }

    public void printlnToString() {
        System.out.println(this.toString());
    }
}
