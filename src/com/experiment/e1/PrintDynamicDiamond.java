package com.experiment.e1;

import java.util.Scanner;

/**
 * 打印动态菱形
 */
public class PrintDynamicDiamond {
    private int numOfRows;

    public PrintDynamicDiamond() {
        this.numOfRows = 0;
    }
    public PrintDynamicDiamond(int numOfRows) {
        this.numOfRows = numOfRows;
    }

    public void setNumOfRows(int numOfRows) {
        this.numOfRows = numOfRows;
    }

    private String[] symbol = {"  ","* ","[]"};
    public void printDiamond() {

        if(numOfRows == 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入行数：");
            numOfRows = scan.nextInt();
        }
        if(numOfRows % 2 == 0) {
            numOfRows++;
            System.out.println("输入非奇数，行数自动加一");
        }

        int spaceIndex_1 = numOfRows / 2; //以1为步频递减
        int startIndex_1 = 1; //以2为步频递增
        int loopIndex = numOfRows / 2;
        int spaceIndex_2 = 1; //以1为步频递增
        int startIndex_2 = numOfRows - 2; //以2为步频递减

        for (int i = 0; i < loopIndex; i++) {

            for (int j = 0; j < spaceIndex_1 - i; j++) {
                System.out.print(symbol[0]);
            }

            for (int j = 0; j < startIndex_1 + i * 2; j++) {
                System.out.print(symbol[1]);
            }

            System.out.println();
        }

        for (int i = 0; i < numOfRows; i++) {
            System.out.print(symbol[1]);
        }

        System.out.println();

        for (int i = 0; i < loopIndex; i++) {

            for (int j = 0; j < spaceIndex_2 + i; j++) {
                System.out.print(symbol[0]);
            }

            for (int j = 0; j < startIndex_2 - i * 2; j++) {
                System.out.print(symbol[1]);
            }

            System.out.println();
        }
    }
}
