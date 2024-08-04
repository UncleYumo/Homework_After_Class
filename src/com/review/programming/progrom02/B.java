package com.review.programming.progrom02;

/**
 * @author uncle_yumo
 * @CreateDate 2024/6/21
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class B extends A {
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