//3.编写一个三角形类（Triangle）。要求：定义三条边作为三角形的属性；定义构造方法，求三角形周长的方法，求三角形面积的方法。
package com.homework.second;
import java.util.*;

public class ClassOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] sides = new double[3];
        System.out.println("Please input the Each Side of your Triangle :");
        for(int i = 0;i < sides.length;i++) {
            sides[i] = scan.nextDouble();
        }
        Triangle triangle = new Triangle(sides[0],sides[1],sides[2]);
        System.out.println("The SideLength of Triangle is : " + triangle.getSideLength());
        System.out.println("The Area of the Triangle is :" + triangle.getArea());
    }
}

class Triangle {
    double side_A;
    double side_B;
    double side_C;

    double sideLength;
    public Triangle(double side_A,double side_B,double side_C) {
        this.side_A = side_A;
        this.side_B = side_B;
        this.side_C = side_C;
        sideLength =  side_A + side_B + side_C;

    }

    public double getSideLength() {
        return sideLength;
    }

    public double getArea() {
        return Math.sqrt((sideLength - side_A) * (sideLength - side_B) * (sideLength - side_C));
    }
}
