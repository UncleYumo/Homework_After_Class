package com.hanshunping.enum_edu;

import com.review.programming.progrom.Color_Print_Utils;
/**
 * @author uncle_yumo
 * @CreateDate 2024/8/4
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Enumeration03 {
    public static void main(String[] args) {
        for (Week week : Week.values()) {
//            Color_Print_Utils.getInstance().printlnYellow(week.toString());
            week.printInfo();
        }
    }
}
@SuppressWarnings({"unused"})
enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
    private final String dayOfWeek;

    public void printInfo() {
        Color_Print_Utils.getInstance().printlnYellow(dayOfWeek);
    }

    Week(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public String toString() {
        return dayOfWeek;
    }
}