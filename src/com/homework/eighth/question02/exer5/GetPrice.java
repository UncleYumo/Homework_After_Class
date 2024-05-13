package com.homework.eighth.question02.exer5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/7
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class GetPrice {
    public static double getPrice(String cost) {
        double sum = 0;

        Scanner scan = new Scanner(cost);
        scan.useDelimiter("\\D+"); // 匹配非数字
        while (scan.hasNext()) {
            try {
                double price = Double.parseDouble(scan.next());
                sum += price;
            } catch (NumberFormatException exp) {
                // 跳过非数字
            }
        }
        return sum;
    }

}
