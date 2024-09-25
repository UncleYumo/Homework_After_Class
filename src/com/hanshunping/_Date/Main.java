package com.hanshunping._Date;
import com.review.programming.progrom.Color_Print_Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/10
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class Main {
    public static void main(String[] args) {
        Date Date = new Date();
        Date Date_test = new Date(16286999999999L);
        String format01 = "yyyy-MM-dd HH:mm:ss";
        String format02 = "yyyy年MM月dd日 第w周 yyyy年的第D天 此时为：a";
        SimpleDateFormat sdf01 = new SimpleDateFormat(format01);
        SimpleDateFormat sdf02 = new SimpleDateFormat(format02);
        String dateStr01 = sdf01.format(Date);
        String dateStr02 = sdf02.format(Date);
        Color_Print_Utils.getInstance().printlnCyan("当前时间（原格式）：" + new SimpleDateFormat(format01).format(Date_test));
        Color_Print_Utils.getInstance().printlnCyan("当前时间（格式1）：" + dateStr01);
        Color_Print_Utils.getInstance().printlnCyan("当前时间（格式2）：" + dateStr02);
    }
}
