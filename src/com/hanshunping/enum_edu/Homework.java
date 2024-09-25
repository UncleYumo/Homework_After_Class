package com.hanshunping.enum_edu;

import java.util.Arrays;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/4
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Homework {
    public static void main(String[] args) {

    }
}

class TestFrock {
    public static void main(String[] args) {
        String[] arg = args;
        System.out.println(arg[0]);

        Frock frock01 = new Frock();
        Frock frock02 = new Frock();
        Frock frock03 = new Frock();
        System.out.println(frock01.getSerialNumber());
        System.out.println(frock02.getSerialNumber());
        System.out.println(frock03.getSerialNumber());
    }
}

class Frock {
    private static int currentNum = 100000;

    Frock() {
        serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    private int serialNumber;
    int getNextNum() {
        currentNum += 100;
        return currentNum;
    }
}