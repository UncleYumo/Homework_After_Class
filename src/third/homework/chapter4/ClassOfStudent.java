// 1. 编写Student类，包括学生的学号no，姓名name和成绩score三个基本属性，以及一个求所有学生总成绩的静态数据sum及学生人数number。
//   使用构造函数对3个学生的基本信息进行初始化，使用静态方法计算3名学生的平均成绩ave。Student类中的方法根据需要自行定义。

package third.homework.chapter4;
import java.util.*;

public class ClassOfStudent {
    public static void main(String[] args) {

        Random rand = new Random();
        Student[] students = new Student[3];

        double sum = 0;
        double number = 0;

        for(int i = 0;i < students.length;i++) {

            students[i] = new Student(); //为每个对象在堆区分配相应的内存空间

            students[i].setNo(i);
            students[i].setName("Student" + i);
            students[i].setScore(rand.nextInt(21) + 80);
            number ++;
        }

        for (Student student : students) {
            System.out.println("Name : " + student.name + "\tNo : " + student.no + "\tScore : " + student.score);
            sum += student.score;
        }

        System.out.println("Total Score is : " + (int)sum);
        System.out.println("Average score is : " + sum/number);

    }
}

class Student {
    int no;
    String name;
    int score;

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
