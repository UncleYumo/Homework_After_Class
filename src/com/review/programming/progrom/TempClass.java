package com.review.programming.progrom;

/**
 * @author uncle_yumo
 * @CreateDate 2024/6/20
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class TempClass {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.f(3,3));
        System.out.println(new A().f(3,3));

        B b = new B();
        System.out.println(b.f(3,3));
    }
}

class A {
    double f(double x, double y) {
        return x + y;
    }
    static int g(int n) {
        return n * n;
    }
}
class B extends A {
    @Override
    double f(double x, double y) {
        double m = super.f(x, y);
        return m + x * y;
    }

    static int g(int n) {
        int m = A.g(n);
        return m + n;
    }
}