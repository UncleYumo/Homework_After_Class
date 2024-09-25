package com.hanshunping.inner_class;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/7
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class InnerClassExercise {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarm_clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarm_clock(new Bell() {
            @Override
            public void ring() {
                Bell.super.ring();
                System.out.println("小伙伴上课了");
            }
        });
    }
}

interface Bell {
    default void ring() {
        System.out.println("闹钟响了");
    }
}

class CellPhone {
    public void alarm_clock(Bell bell) {
        bell.ring();
    }
}