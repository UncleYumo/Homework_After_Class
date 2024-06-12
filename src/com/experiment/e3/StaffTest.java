package com.experiment.e3;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/22
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class StaffTest {
    public static void main(String[] args) {
        Staff staff01 = new Staff("001","员工一号",21,3000);
        Staff staff02 = new Staff("002","员工二号",33,4000);
        Staff staff03 = new Staff("003","员工三号",44,5000);

        staff01.showAllInfo();
        staff02.showAllInfo();
        staff03.showAllInfo();

        System.out.println("\n修改员工一号的所有信息为员工四号：");

        staff01.setName("员工四号");
        staff01.setId("004");
        staff01.setAge(30);
        staff01.setSalary(6000);

        staff01.showAllInfo();


    }
}
