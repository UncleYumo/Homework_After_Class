package com.experiment.e1;

/**
 * 编写一个代表三角形的类
 * 其中，三条边为三角形的属性，并封装有三角形的面积和周长的方法,并设计构造方法.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getLength() {
        return a + b + c;
    }
    public double getArea() {
        //面积 = √(p/2) * (p/2 - a) * (p/2 - b) * (p/2 - c)
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
