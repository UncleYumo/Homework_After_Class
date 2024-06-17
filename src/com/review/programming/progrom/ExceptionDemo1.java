package com.review.programming.progrom;

/**
 * @author uncle_yumo
 * @CreateDate 2024/6/14
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class ExceptionDemo1 {

    public static void main(String[] args) {
        Color_Print_Utils.getInstance().printlnYellow("-------- start --------\n");
        try {
            int[] arr = null;
            int[] arr1 = {0};
            int[] arr2 = {0,1,19,21,4};
            testException.getMax(arr);
            testException.getMax(arr1);
            testException.getMax(arr2);
        } catch (Exception e) {
            Color_Print_Utils.getInstance().printlnFontAndBackgroundWithColor(
                    Color_Print_Utils.getInstance().Font_Color_Black,
                    Color_Print_Utils.getInstance().Background_Color_Cyan,
                    e.fillInStackTrace().toString()
            );
        }

        Color_Print_Utils.getInstance().printlnYellow("\n-------- end --------");
    }
}

class testException {
    public static int getMax(int[] arr) {
//        if(arr == null) {
//            throw new NullPointerException("产生空指针异常，请检查传入的数组是否为null");
//        }
        if(arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("产生数组越界异常，无法获取最大值");
        }
        int maxTemp = arr[0];
        for (int i : arr) {
            if (i > maxTemp) {
                maxTemp = i;
            }
        }
        return maxTemp;
    }
}
