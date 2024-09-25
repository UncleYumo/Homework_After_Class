package com.hanshunping._string;

import com.review.programming.progrom.Color_Print_Utils;

import java.util.Arrays;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/11
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Homework {
    public static void main(String[] args) {
        try {
            int INDEXES_MODEL = 1;
            int INSTINCT_MODEL = 0;
            String test = "123456";
            test = reverse(test, 1, 1, INSTINCT_MODEL);
            Color_Print_Utils.getInstance().printlnYellow(test);
            for (char c : test.toCharArray()) {
                if(c == '[' || c == ']' || c == ',' || c == ' ') {
                    continue;
                }
                System.out.print(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String reverse(String str, int start, int end, int model) {
        if (model == 0) {
            start--; end--;
            if (start < 0 || end > str.length() - 1) {
                throw new RuntimeException("请输入正确的索引");
            }else if (start >= end) {
                throw new RuntimeException("起始索引不能大于或等于终止索引");
            }
        }

        char[] arr_char = str.toCharArray();
        char temp = ' ';
        for (int i = 0; i < end - start - 1; i++) {
            for (int j = 0; j < end - start - i; j++) {
                temp = arr_char[j + start];
                arr_char[j + start] = arr_char[j + start + 1];
                arr_char[j + start + 1] = temp;
            }
        }
        return Arrays.toString(arr_char);
    }
}
