package com.javaSE.reflect;

import com.review.programming.progrom.Color_Print_Utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author uncle_yumo
 * @fileName Main
 * @createDate 2024/9/28 September
 * @school 无锡学院
 * @studentID 22344131
 * @description 反射的使用
 */

public class Main {
    public static void main(String[] args) {
//        test01();
//        test02();
        test03();
    }

    private static void test03() {
        Student student = new Student();
        try {
            Field name = student.getClass().getDeclaredField("name");
            name.setAccessible(true);  // 设置为可访问
            name.set(student, "Harry Potter");
            System.out.println(name.get(student));
            student.printlnToString();

            Student jimmy_kim = new Student("123123", "Jimmy Kim", 25);
            Field className = jimmy_kim.getClass().getDeclaredField("className");
            className.setAccessible(true);  // 设置为可访问
            // 去除className的final修饰符，使得className可以被修改
            className.setInt(className, className.getModifiers() & ~Modifier.FINAL);
            className.set(jimmy_kim, "Art");

            // 解释：通过反射，我们可以直接操作类的私有属性，而不用通过getter和setter方法。
            System.out.println(className.get(jimmy_kim));
            jimmy_kim.printlnToString();


        } catch (NoSuchFieldException e) {
            Color_Print_Utils.getInstance().printlnRed("Cannot find field | 无法找到字段: " + e.getMessage());
        } catch (IllegalAccessException e) {
            Color_Print_Utils.getInstance().printlnRed("Cannot access field | 无法访问字段: " + e.getMessage());
        }
    }

    public static void test01() {
        Color_Print_Utils.getInstance().programStart();

        Class<Student> clazz = Student.class;

        try {

            Student student = clazz.getConstructor().newInstance();
            student.printlnToString();

            Student student1 = clazz.getConstructor(
                    String.class, String.class, int.class
            ).newInstance(
                    "11223344", "John Doe", 20);

            student1.printlnToString();

            Method method = clazz.getMethod("printlnToString");
            method.invoke(new Student("123123", "Harry Potter", 25));

            Method method1 = clazz.getMethod("setName", String.class, int.class);

            Arrays.stream(method1.getParameterTypes()).toList()
                    .forEach(System.out::println);

        } catch (InstantiationException e) {
            Color_Print_Utils.getInstance().printlnRed("Cannot create instance of class: " + clazz.getName());
        } catch (IllegalAccessException e) {
            Color_Print_Utils.getInstance().printlnRed("Cannot access constructor of class: " + clazz.getName());
        } catch (NoSuchMethodException e) {
            Color_Print_Utils.getInstance().printlnRed("Cannot find constructor of class: " + clazz.getName());
        } catch (InvocationTargetException e) {
            Color_Print_Utils.getInstance().printlnRed("Error occurred while creating instance of class: " + clazz.getName());
        }

        Color_Print_Utils.getInstance().programEnd();
    }

    public static void test02() {
        try {
            Class<?> clazz = Class.forName("com.javaSE.reflect.Student");
            Field name = clazz.getDeclaredField("name");
            name.setAccessible(true);  // 设置为可访问
            System.out.println(name);

            Field[] fields = clazz.getDeclaredFields();
            Arrays.stream(fields).toList().forEach(
                    field -> field.setAccessible(true)
            );
            Arrays.stream(fields).toList().forEach(
                    System.out::println
            );
            Arrays.stream(fields).toList().stream().filter(
                    field -> field.getName().equals("id")
            ).forEach(
                    field -> {
                        try {
                            field.set(null, "123456");
                        } catch (IllegalAccessException e) {
                            Color_Print_Utils.getInstance().printlnRed("Cannot access field | 无法访问字段: " + field.getName());
                        }
                    }
            );



        } catch (ClassNotFoundException e) {
            Color_Print_Utils.getInstance().printlnRed("Cannot find class | 无法找到类: " + e.getMessage());
        } catch (NoSuchFieldException e) {
            Color_Print_Utils.getInstance().printlnRed("Cannot find field | 无法找到字段: " + e.getMessage());
        }
    }

}
