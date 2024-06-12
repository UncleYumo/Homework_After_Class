package com.homework.sixth;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/20
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class ExceptionTest {
    public static void main(String[] args) {
//        Action action1 = new Action();
//        Action action2 = new Action();
//        System.out.println("Action 1：");
//        action1.management(10);
//        System.out.println("\n"+ "Action 2：");
//        action2.management(-10);

        Action action = new Action();
        try {
//            action.solveSystemOfEquations(0,0,0); // 参数错误
//            action.solveSystemOfEquations(1,1,7); // 方程无实数解
            action.solveSystemOfEquations(1,2,1); // 方程有两个相等的实根
        }catch (CustomExceptionClass e) {
            System.out.println(e.getMessage());
        }


    }
}

class Action {
    private int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void register(int id) throws CustomExceptionClass{
        if(id < 0) {
            throw new CustomExceptionClass("异常！号码为负！");
        }
        setId(id);
        System.out.println("登记成功！ID：" + getId());
    }

    public void management(int id) {
        try {
            register(id);
            System.out.println("成功管理！ID：" + getId());
        }catch (CustomExceptionClass e) {
            System.out.println(e.getMessage());
        }
    }

    public void solveSystemOfEquations(double a, double b, double c) throws IllegalArgumentException, CustomExceptionClass {
        double x1 = 0;
        double x2 = 0;
        double disc = b * b - 4 * a * c;
        double p = -b / ( 2 * a ) ;
        double q = Math.sqrt(Math.abs(disc)) / (2 * a);
        if(a== 0.0){
            throw new CustomExceptionClass("二次方的系数为零，不是一个二次方程");
        }
        else if (disc > 0.0){
            x1 = p + q;
            x2 = p - q;
            System.out.println("方程有两个不等的实根");
            System.out.printf("x1=%.2f,x2=%.2f\n",x1,x2);
        }
        else if(disc == 0.0){
            x1 = x2 = p;
            System.out.println("方程有两个相等的实根");
            System.out.printf("x1 = x2 =%.2f\n",x1);
        }
        else{
            System.out.println("方程无实数解");
        }
    }
}
