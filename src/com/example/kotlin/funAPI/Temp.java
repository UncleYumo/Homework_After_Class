package com.example.kotlin.funAPI;

import com.review.programming.progrom.Color_Print_Utils;

/**
 * @author uncle_yumo
 * @fileName Temp
 * @createDate 2024/10/1 October
 * @school 无锡学院
 * @studentID 22344131
 * @description
 */

public class Temp implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(300);
                Color_Print_Utils.getInstance().printlnCyan("Thread " + Thread.currentThread().getName() + " is running");
            } catch (InterruptedException e) {
                Color_Print_Utils.getInstance().printlnYellow("InterruptedException | " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Temp temp = new Temp();
        Thread thread = new Thread(temp);
        thread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(300);
                        Color_Print_Utils.getInstance().printlnBlue("Thread " + Thread.currentThread().getName() + " is running");
                    } catch (Exception e) {
                        Color_Print_Utils.getInstance().printlnYellow("InterruptedException | " + e.getMessage());
                    }
                }
            }
        }).start();
    }
}
