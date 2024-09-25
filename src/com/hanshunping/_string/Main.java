package com.hanshunping._string;
import java.util.Scanner;
import java.util.function.Function;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/7
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class Main {
    public static void main(String[] args) {
        Main.Function02("12312341241232.2332");
    }
    public static void Function01(String price) {
        String[] arr_str = price.split("\\.");
//        System.out.println(arr_str[0]);
        int integer_len = arr_str[0].length();
        int split_times = integer_len / 3;
//        System.out.println(split_times);
        String str0 = arr_str[0];
        char[] arr_char = str0.toCharArray();

        for (int i = 0; i < (arr_char.length / 2); i++) {
            char temp = arr_char[i];
            arr_char[i] = arr_char[arr_char.length - i - 1];
            arr_char[arr_char.length - i - 1] = temp;
        }

        StringBuffer sb = new StringBuffer(new String(arr_char));

        if (split_times > 0) {
            for (int i = 1; i <= split_times; i++) {
                sb.insert(3 * i + (i-1),',');
            }
        }
//        System.out.println(sb);
        arr_char = new String(sb).toCharArray();
//        System.out.println(arr_char);

        for (int i = 0; i < (arr_char.length / 2); i++) {
            char temp = arr_char[i];
            arr_char[i] = arr_char[arr_char.length - i - 1];
            arr_char[arr_char.length - i - 1] = temp;
        }

        System.out.println(new String(arr_char) + "." + arr_str[1]);
    }

    public static   void Function02(String price) {
        StringBuffer sb = new StringBuffer(price);
        for(int i = sb.lastIndexOf(".")-3; i > 0; i-=3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
