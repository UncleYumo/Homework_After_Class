package com.experiment.e5;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/8
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * （1）设计教师类Teacher。
 * 该类包含两个私有成员变量name和no（分别用于存放姓名和教工号），
 * 以及两个public成员方法，分别为：
 * void setData(String name,String no) 用于设置姓名和教工号；
 * void print() 用于输出姓名和教工号。
 */

public class Teacher {
    private String name;
    private String no;

    public void setData(String name, String no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void print() {
        System.out.println("姓名：" + name + "  教工号：" + no);
    }
}
