package com.homework.fourth;

/**
 * 一、编程题
 * 1. 继承的使用：（a）编写Student类，包括学生的学号no，姓名name和专业三个基本属性，并定义构造方法和其他成员方法；
 * （b）定义本科生类（UnderGraduate）要求：
 * (1) 继承学生类;
 * (2) 定义本科生类的构造方法；
 * (3) 增加一个本学期所选课程信息属性。
 * (4) 定义本科生类的其他方法。
 * 最后定义测试类测试。
 * 2.设计一个商品类，字段包括商品名称、重量、价格、配件数量、配件制造厂商。
 *   要求：有构造函数,根据需要定义成员方法。 重写：toString方法；  重写：equals方法，进行两件商品的比较。最后定义测试类进行测试。
 */
public class Student {
    private String no;
    private String name;
    private String major;

    public Student() {

    }

    public Student(String no, String name, String major) {
        this.no = no;
        this.name = name;
        this.major = major;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }
    public void showInfo() {
        System.out.println("Sno : " + getNo() + " Name : " + getName() + " Major : " + getMajor());
    }
}
