package com.hanshunping._genericity;

import com.review.programming.progrom.Color_Print_Utils;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/14
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        Color_Print_Utils.getInstance().printlnPurple("-------------------------------start main------------------------------");
        Main main = new Main();
        main.testFunc(new String("Hello"), new Integer(10));
        Color_Print_Utils.getInstance().printlnCyanBlack("-------------------------------end main-------------------------------");
    }
    public <T, E> void testFunc(T t, E e){
        Color_Print_Utils.getInstance().printlnYellow("T: " + t + " E: " + e);
    }
}