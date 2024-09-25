package com.hanshunping._Date;
import com.review.programming.progrom.Color_Print_Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/11
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * 1. Calendar类是一个抽象类，构造器为私有权限
 * 2. 该类提供了一些方法，如：get()、set()、add()等，用于操作日期和时间
 * 3. 该类提供了一些静态方法，如：getInstance()、getTimeInMillis()等，用于获取当前日期和时间
 */

public class _Calendar {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        Color_Print_Utils.getInstance().printlnYellow("当前时间：" + calendar.getTime());
//        Color_Print_Utils.getInstance().printlnYellow(
//                "Current Time：\n" +
//                calendar.get(Calendar.YEAR) + "-" +
//                (calendar.get(Calendar.MONTH)+1) + "-" +
//                calendar.get(Calendar.DAY_OF_MONTH) + " " +
//                calendar.get(Calendar.HOUR) + ":" +
//                calendar.get(Calendar.MINUTE) + ":" +
//                calendar.get(Calendar.SECOND));
        // 第三代日期
//        LocalDateTime localDateTime = LocalDateTime.now();
//        Color_Print_Utils.getInstance().printlnPurple("当前时间：" + localDateTime);
//        Color_Print_Utils.getInstance().printlnPurple(
//                "Current Time：" +
//                localDateTime.getYear() + "-" +
//                localDateTime.getMonthValue() + "-" +
//                localDateTime.getDayOfMonth() + " " +
//                localDateTime.getHour() + ":" +
//                localDateTime.getMinute() + ":" +
//                localDateTime.getSecond());
//    }
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日--HH时mm分ss秒");
        Color_Print_Utils.getInstance().printlnYellow(formatter.format(localDateTime));
    }
}
