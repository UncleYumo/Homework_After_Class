package com.javaSE.annotation;

import com.review.programming.progrom.Color_Print_Utils;
import com.sun.jdi.event.ThreadDeathEvent;

import java.lang.String;

import static java.lang.Thread.sleep;

/**
 * @author uncle_yumo
 * @fileName Main
 * @createDate 2024/9/28 September
 * @school 无锡学院
 * @studentID 22344131
 * @description This is the main class of the program.
 */

public class Main {
    public static void main(String[] args) {
        Color_Print_Utils.getInstance().programStart();

//        testMain();


        Color_Print_Utils.getInstance().programEnd();
    }

    static void test() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                Color_Print_Utils.getInstance().printlnYellow(
                        "InterruptedException | 线程中断异常 : " + e.getMessage()
                );
            }
            Color_Print_Utils.getInstance().printlnGreen("test() | 线程执行中... " + i);
        }
    }

    static void test2() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                Color_Print_Utils.getInstance().printlnYellow(
                        "InterruptedException | 线程中断异常 : " + e.getMessage()
                );
            }
            Color_Print_Utils.getInstance().printlnGreen("test2() | 线程执行中... " + i);
        }
    }

    static void testMain() {
        Thread t1 = new Thread(Main::test);
        Thread t2 = new Thread(Main::test2);
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        Color_Print_Utils.getInstance().printlnYellow(
                                "InterruptedException | 线程中断异常 : " + e.getMessage()
                        );
                    }
                    Color_Print_Utils.getInstance().printlnCyan("匿名内部类 | 线程执行中... " + i);
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();  // 等待t1线程执行完毕
            t2.join();  // 等待t2线程执行完毕
            Color_Print_Utils.getInstance().printlnGreen("主线程执行完毕...");
        } catch (InterruptedException e) {
            Color_Print_Utils.getInstance().printlnYellow(
                    "InterruptedException | 线程中断异常 : " + e.getMessage()
            );
        }
    }
}
