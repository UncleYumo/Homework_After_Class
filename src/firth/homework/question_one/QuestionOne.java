package firth.homework.question_one;

import java.util.Scanner;

/**
 * 问题描述：
 * 小智同学预计从长春工业大学北湖校区出发，前往东北师范大学参加吉林省大学生程序设计竞赛。出发的路线是乘坐快轨8号线从大学路站出发到达北环城路换乘
 * 地铁1号线，然后在东北师范大学站下车。大学城站到北环城路站票价2.8元，北环城路站到东北师范大学站票价1.2元。1号线有空调车厢，如果乘坐空调车厢票
 * 价上浮10%；8号线在早7:00-9:00 和晚16:00-18:00为早晚高峰时期，票价上浮30%。根据题意计算小智同学在早7:30分乘坐8号线换乘1号线空调车厢需花费
 * 多少元？
 * 显示小智同学的所有行程。
 */
public class QuestionOne {
    public static void main(String[] args) {

        SubwayLine_1 subwayLine1 = new SubwayLine_1(1.2);
        SubwayLine_8 subwayLine8 = new SubwayLine_8(2.8);
        System.out.println("小智同学全程所需花费的车费为：" + (subwayLine1.getPrice() + subwayLine8.getPrice()) + "元");
        System.out.println("小智同学的行程为：" + subwayLine8.getItinerary() + " 换乘 " + subwayLine1.getItinerary());

    }
}

class SubwayLine_8 {
    Scanner scan = new Scanner(System.in);

    public SubwayLine_8(double PRICE_SUBWAY_LINE_8) {
        this.PRICE_SUBWAY_LINE_8 = PRICE_SUBWAY_LINE_8;
    }

    private double PRICE_SUBWAY_LINE_8;
    public double getPrice() {
        System.out.println("乘坐区间是否属于早晚高峰：(Y/N)");
        char flag = scan.next().charAt(0);
        if(!Character.isUpperCase(flag)) {
            Character.toUpperCase(flag);
        }
        if(flag == 'Y') {
            return PRICE_SUBWAY_LINE_8 + (PRICE_SUBWAY_LINE_8 * 0.3);
        }else {
            return PRICE_SUBWAY_LINE_8;
        }
    }
    public String getItinerary() {
        return "大学路 --> 北环城";
    }
}

class SubwayLine_1 {
    Scanner scan = new Scanner(System.in);

    public SubwayLine_1(double PRICE_SUBWAY_LINE_1) {
        this.PRICE_SUBWAY_LINE_1 = PRICE_SUBWAY_LINE_1;
    }

    private double PRICE_SUBWAY_LINE_1;
    public double getPrice() {
        System.out.println("乘坐区间是否属于空调车厢：(Y/N)");
        char flag = scan.next().charAt(0);
        if(!Character.isUpperCase(flag)) {
            Character.toUpperCase(flag);
        }
        if(flag == 'Y') {
            return PRICE_SUBWAY_LINE_1 + (PRICE_SUBWAY_LINE_1 * 0.1);
        }else {
            return PRICE_SUBWAY_LINE_1;
        }
    }
    public String getItinerary() {
        return "北环城 --> 东北师范";
    }
}