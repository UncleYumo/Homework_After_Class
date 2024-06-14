package com.review.programming.progrom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author uncle_yumo
 * @CreateDate 2024/6/14
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class ExceptionDemo1 {

    public static void main(String[] args) throws ParseException {
        String time = "2024年6月14日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println("默认的日期为：" + time);
    }
}
