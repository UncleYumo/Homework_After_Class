package com.homework.fifth;

/**
 * to test class - Student and its subclass - UnderGraduate
 */
public class UnderGraduateTest {
    public static void main(String[] args) {

        Student student = new Student("2024301","郭富城","软件工程");
        student.showInfo();
        UnderGraduate underGraduate = new UnderGraduate("2024302","刘亦菲","土木工程","考研408");
        underGraduate.getInfo();

    }
}
