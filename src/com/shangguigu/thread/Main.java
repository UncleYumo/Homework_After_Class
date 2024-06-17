package com.shangguigu.thread;

/**
 * @author uncle_yumo
 * @CreateDate 2024/6/12
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        ExtendThread extendThread = new ExtendThread();
        ImplementRunnable implementRunnable = new ImplementRunnable();
        extendThread.start();
        Thread thread = new Thread(implementRunnable);
        thread.start();
    }
}

class ExtendThread extends Thread {
    @Override
    public void run() {
        System.out.println("继承Thread类方式创建线程");
    }
}

class ImplementRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("实现Runnable接口方式创建线程");
    }
}

class PrintNumberThread extends Thread {

    public PrintNumberThread() {}
    public PrintNumberThread(String name) {
        super(name);
    }
    public PrintNumberThread(ThreadGroup group, String name) {
        super(group, name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
