package com.javaSE.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author uncle_yumo
 * @CreateDate 2024/9/28
 * @School 无锡学院
 * @StudentID 22344131
 * @Description 实现List集合的基本操作
 */

public class Main {
    public static void main(String[] args) {
        testList_Student();
    }

    public static void testList_Student() {
        Scanner scanner = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        list.add(new Student("22344131", "Tom", 18));
        list.add(new Student("22344132", "Jerry", 19));
        list.add(new Student("22344133", "Lily", 18));
        list.add(new Student("22344134", "Mary", 19));
        list.add(new Student("22344135", "Lucy", 18));
        list.add(new Student("22344136", "Mike", 19));
        list.add(new Student("22344137", "Jack", 18));

        list.forEach(student -> System.out.println(student.toString()));

        System.out.println("查询姓名为指定值的学生：");
        String name = scanner.nextLine();
        List<Student> result = list.stream().filter(
                student -> student.getName().equals(name)
        ).toList();
        if (result.isEmpty()) {
            System.out.println("没有找到该学生！");
        } else {
            result.forEach(student -> System.out.println(student.toString()));
        }

        System.out.println("查询学号为指定值的学生：");
        String id = scanner.nextLine();
        result = list.stream().filter(
                student -> student.getId().equals(id)
        ).toList();
        if (result.isEmpty()) {
            System.out.println("没有找到该学生！");
        } else {
            result.forEach(student -> System.out.println(student.toString()));
        }

        System.out.println("查询年龄大于指定值的学生：");
        int age = scanner.nextInt();
        result = list.stream().filter(
                student -> student.getAge() > age
        ).toList();
        if (result.isEmpty()) {
            System.out.println("没有找到该学生！");
        } else {
            result.forEach(student -> System.out.println(student.toString()));
        }
    }

    static class Student {
        public String id;
        public String name;
        public int age;

        public Student(String id, String name, int age) {
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

        public void setName(String name) {
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
    }
}
