package com.experiment.e4;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/22
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class CommodityTest {
    public static void main(String[] args) {
        Commodity commodity01 = new Commodity("黑人牙膏",120,300,7,"宝洁公司");
        Commodity commodity02 = new Commodity("无锡学院",120,300,7,"无锡市教育局");
        Commodity commodity03 = new Commodity("黑人牙膏",120,300,7,"宝洁公司");

        System.out.println(commodity01.toString());
        System.out.println(commodity02.toString());
        System.out.println(commodity03.toString());

        if(commodity01.equals(commodity02)) {
            System.out.println("商品01与商品02相同");
        }else {
            System.out.println("商品01与商品02不同");
        }

        if(commodity01.equals(commodity03)) {
            System.out.println("商品01与商品03相同");
        }else {
            System.out.println("商品01与商品03不同");
        }
    }
}
