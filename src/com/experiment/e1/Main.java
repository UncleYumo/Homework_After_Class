package com.experiment.e1;

public class Main {
    public static void main(String[] args) {

//        System.out.println("编程题一");
//        System.out.println("--------------------------------");
//        PrintDynamicDiamond printDynamicDiamond = new PrintDynamicDiamond(17);
//        printDynamicDiamond.printDiamond();
//        printDynamicDiamond.setNumOfRows(7);
//        System.out.println("--------------------------------");
//        printDynamicDiamond.printDiamond();


//        System.out.println("编程题二");
//        System.out.println("--------------------------------");
//        NumberOfDaffodils numberOfDaffodils = new NumberOfDaffodils();
//        numberOfDaffodils.getAllNumberOfDaffodils();

        System.out.println("编程题三");
        System.out.println("--------------------------------");
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("The SideLength of Triangle is : " + triangle.getLength());
        System.out.println("The Area of the Triangle is :" + triangle.getArea());
        System.out.println("--------------------------------");
        Triangle triangle2 = new Triangle(7,8,9);
        System.out.println("The SideLength of Triangle is : " + triangle2.getLength());
        System.out.println("The Area of the Triangle is :" + triangle2.getArea());
    }
}
