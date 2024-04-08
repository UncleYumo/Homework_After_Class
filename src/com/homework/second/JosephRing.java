package com.homework.second;

import java.util.Scanner;

public class JosephRing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入总人数 N 和报数 M：");
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] circle = new int[N];
        for (int i = 0; i < N; i++) {
            circle[i] = i + 1;
        }

        int index = 0; // 从第一个人开始
        while (circle.length > 1) {
            for (int i = 1; i < M; i++) {
                index = (index + 1) % circle.length;
            }
            System.out.println("此轮出圈的是：" + circle[index]);
            circle = removeAt(circle, index);
            index = (index + 1) % circle.length; // 调整指针
        }

        System.out.println("最后剩下的是：" + circle[0]);
    }

    // 用于移除数组中指定位置的元素
    public static int[] removeAt(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }
}
