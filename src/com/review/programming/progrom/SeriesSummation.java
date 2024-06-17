package com.review.programming.progrom;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * @author uncle_yumo
 * @CreateDate 2024/6/14
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class SeriesSummation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int[][] arrIntegers = new int[10][10];
        int sum = 0;
        for (int i = 0; i < arrIntegers.length; i++) {
            for (int j = 0; j < arrIntegers[i].length; j++) {
                arrIntegers[i][j] = rand.nextInt(90 + 1) + 10; // 获取范围为10-100的整形
            }
        }

        for (int[] arrInteger : arrIntegers) {
            for (int arr : arrInteger) {
                sum += arr;
            }
        }
        System.out.println("The Sum of Series is : " + sum);
    }
}
