package com.experiment.e5;

/**
 * @author uncle_yumo
 * @CreateDate 2024/5/8
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 * （2）设计继承上述题目（1）的Teacher类的子类University_teacher。
 * 子类University_teacher不仅具有父类的成员变量name（姓名）、no（教工号），还定义新成员变量academy（学院）、department（系）；
 * 并重载方法void setData(String name,String no, String academy, String department) 用于设置姓名、教工号、学院和系；
 * 以及重写父类中void print()方法，实现输出姓名、教工号、学院和系。
 *
 * 在main()方法中创建一个该子类对象s，接着调用相应方法设置一个学生的姓名、教工号、学院和系并输出。
 */
public class University_teacher extends Teacher{
    private String academy;
    private String department;

    void setData(String name,String no, String academy, String department) {
        super.setData(name, no);
        this.academy = academy;
        this.department = department;
    }
    public void print() {
        System.out.println("姓名：" + getName() + " 教工号：" + getNo() + " 学院：" + academy + " 系：" + department);
    }
}
