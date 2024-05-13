package com.homework.eighth.question02.exer3;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/7
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * 3.计算某年某月某日和某年某月某日之间的天数间隔，
 * 要求年、月、日使用main方法的命令行参数传递到程序中。
 */
public class Exercise03 {
    public static void main(String[] args) {
        // 默认之前的日期为1949年10月1日
        // 计算当前日期和之前日期的天数间隔
        String[] data = new String[3];

        System.arraycopy(args, 0, data, 0, args.length); // 将命令行参数复制到data数组中

        System.out.println("当前日期：" + data[0] + "年" + data[1] + "月" + data[2] + "日");
        System.out.println("之前日期：" + "1949年10月1日");
        // 计算当前日期和之前日期的天数间隔
        int days = 0;
        int year = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int day = Integer.parseInt(data[2]);
        int preYear = 1949;
        int preMonth = 10;
        int preDay = 1;
        if (year > preYear) {
            days = (year - preYear) * 365 + (month - preMonth) * 30 + (day - preDay);
        } else if (year == preYear) {
            if (month > preMonth) {
                days = (month - preMonth) * 30 + (day - preDay);
            } else if (month == preMonth) {
                days = day - preDay;
            } else {
                days = 0;
            }
        } else {
            days = 0;
        }
        System.out.println("天数间隔：" + days + "天");


    }
}