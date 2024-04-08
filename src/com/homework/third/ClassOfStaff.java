//2.定义一个员工类（Staff），包含编号、姓名、年龄、工资等属性，定义成员方法实现对员工信息的设置和显示，并定义该类的构造方法。

package com.homework.third;

public class ClassOfStaff {
    public static void main(String[] args) {

        Staff staff1 = new Staff();
        Staff staff2 = new Staff();

        staff1.setName("杨嘉琦");
        staff1.setAge(21);
        staff1.setSalary(3000);

        staff2.setName("东方不败");
        staff2.setAge(200);
        staff2.setSalary(3999.99);

        staff1.showInfo();
        staff2.showInfo();
    }
}

class Staff {
    int no;
    String name;
    int age;
    double salary;
    static int number = 0;

    public Staff () {
        number++;
        no = number;
        System.out.println("You had created an new Staff, No is : " + number);
        }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void showInfo() {
        System.out.println("No : " + no + "\tName : " + name + "\tAge : " + age + "\tSalary : " + salary);
    }
}

