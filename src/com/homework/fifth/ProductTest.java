package com.homework.fifth;

public class ProductTest {
    public static void main(String[] args) {

        Product product1 = new Product("香蕉",10,11.1,12,"海南");
        Product product2 = new Product("辣椒",20,11,10,"贵州");
        Product product3 = new Product("辣椒",20,11,10,"贵州");
        Product product4 = new Product("辣椒",10,11,10,"贵州");

        System.out.println("1号商品信息：\n" + product1.toString());
        System.out.println("2号商品信息：\n" + product2.toString());
        System.out.println("3号商品信息：\n" + product3.toString());
        System.out.println("4号商品信息：\n" + product4.toString());

        if(product2.euqals(product3)) {
            System.out.println("商品2与商品3相同");
        }else {
            System.out.println("商品2与商品3不同");
        }

        if(product2.euqals(product4)) {
            System.out.println("商品2与商品4相同");
        }else {
            System.out.println("商品2与商品4不同");
        }

    }

}
