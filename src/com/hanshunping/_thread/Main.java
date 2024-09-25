package com.hanshunping._thread;

import com.review.programming.progrom.Color_Print_Utils;

import java.util.Scanner;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/14
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class Main {
    public static void main(String[] args) {
        WithdrawMoney person01 = new WithdrawMoney();
        WithdrawMoney person02 = new WithdrawMoney();
        Thread t1 = new Thread(person01, "用户01");
        Thread t2 = new Thread(person02, "用户02");
        t1.start();
        t2.start();
    }
    public static void run(Ticket_Office ticket_office) {
        new Thread(ticket_office).start();
        new Thread(ticket_office).start();
        new Thread(ticket_office).start();
    }
    public static void run2() {
        T t  = new T();
        Thread thread = new Thread(t);
        thread.setName("子线程");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        try {
            Color_Print_Utils.getInstance().printlnGreen("主线程休眠50秒");
            Thread.sleep(5000);
            thread.interrupt();
            Color_Print_Utils.getInstance().printlnRed("主线程中断子线程");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void run3() {
        Thread t1 = new Thread(new ThreadJoin());
        t1.start();
        Color_Print_Utils.getInstance().printlnGreen("Thread " + Thread.currentThread().getName() + " | 开始运行");
        for (int i = 0; i < 20; i++) {
            if (i == 5) {
                try {
                    Color_Print_Utils.getInstance().printlnGreen("Thread " + Thread.currentThread().getName() + " | 等待子线程结束");
                    t1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Color_Print_Utils.getInstance().printlnPurple("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Thread01 implements Runnable {
    public static int count = 0;
    int id;
    Thread01() {
        count++;
        id = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(id == 1) {
                Color_Print_Utils.getInstance().printlnYellow("Thread01 start" + i);
            } else if (id == 2) {
                Color_Print_Utils.getInstance().printlnGreen("Thread01 start" + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Ticket_Office implements Runnable{
    private int ticket = 50;
    public static int count = 0;
    private boolean loop = true;
    public Ticket_Office() {}
    @Override
    public void run() {
        while (loop) {
            sell_Ticket();
        }
    }
    public synchronized void sell_Ticket() {
        if (ticket <= 0) {
            Color_Print_Utils.getInstance().printlnRed(
                    Thread.currentThread().getName() +
                            " | 票已售完 | " +
                            System.currentTimeMillis() +
                            " | " +
                            ticket +
                            " | " +
                            count);
            loop = false;
            return;
        }
        ticket--;
        count++;
        switch (Thread.currentThread().getName()) {
            case "Thread-0":
                Color_Print_Utils.getInstance().printlnCyan("Thread " + Thread.currentThread().getName() + " | 正在售票 | " + ticket);
                break;

            case "Thread-1":
                Color_Print_Utils.getInstance().printlnYellow("Thread " + Thread.currentThread().getName() + " | 正在售票 | " + ticket);
                break;

            case "Thread-2":
                Color_Print_Utils.getInstance().printlnGreen("Thread " + Thread.currentThread().getName() + " | 正在售票 | " + ticket);
                break;
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
    public String getCount() {
        return "销售次数" + count;
    }
}

class T implements Runnable {
    @Override
    public void run() {
        while (true) {
            Color_Print_Utils.getInstance().printlnPurple("Thread " + Thread.currentThread().getName() + " | 正在运行");
            try {
                Color_Print_Utils.getInstance().printlnRed("Thread " + Thread.currentThread().getName() + " | 休眠300秒");
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                Color_Print_Utils.getInstance().printlnRed("Thread " + Thread.currentThread().getName() + " | 被中断");
            }
        }
    }
}

class ThreadJoin implements Runnable {
    @Override
    public void run() {
        Color_Print_Utils.getInstance().printlnGreen("Thread " + Thread.currentThread().getName() + " | 开始运行");
        for (int i = 0; i < 20; i++) {
            Color_Print_Utils.getInstance().printlnYellow("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DeadLockDemo extends Thread {
    static Object lock1 = new Object();
    static Object lock2 = new Object();
    boolean flag = false;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (lock1) {
                Color_Print_Utils.getInstance().printlnCyan("Thread " + Thread.currentThread().getName() + " | 获得 lock1");
                synchronized (lock2) {
                    Color_Print_Utils.getInstance().printlnYellow("Thread " + Thread.currentThread().getName() + " | 获得 lock2");
                }
            }
        } else {
            synchronized (lock2) {
                Color_Print_Utils.getInstance().printlnYellow("Thread " + Thread.currentThread().getName() + " | 获得 lock2");
                synchronized (lock1) {
                    Color_Print_Utils.getInstance().printlnCyan("Thread " + Thread.currentThread().getName() + " | 获得 lock1");
                }
            }
        }
    }
}
class A extends Thread {
    private boolean loop = true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            Color_Print_Utils.getInstance().printlnCyan(
                    "当前线程: " + Thread.currentThread().getName() + " | " + (int)(Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Color_Print_Utils.getInstance().printlnCyan("线程 " + Thread.currentThread().getName() + " 退出");
    }
}

class B extends Thread {
    private A a;
    private Scanner scan = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            // 接收到用户的输入
            Color_Print_Utils.getInstance().printlnYellow("请输入您的指令: ");
            char key = scan.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                // 以通知的方式结束A线程
                a.setLoop(false);
                Color_Print_Utils.getInstance().printlnYellow("已通知A线程结束");
                Color_Print_Utils.getInstance().printlnBlue("线程: " + Thread.currentThread().getName() + " | 退出");
                break;
            }
        }
    }
}

class WithdrawMoney implements Runnable {
    private static int amount = 100000;
    private static boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            withdraw();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Color_Print_Utils.getInstance().printlnGreen("Thread: " + Thread.currentThread().getName() + " 退出");
    }

    private synchronized static void withdraw() {
        if (amount <= 0) {
            Color_Print_Utils.getInstance().printlnRed("Thread: " + Thread.currentThread().getName() + " 余额不足");
            loop = false;
            return;
        }
        amount -= 1000;
        Color_Print_Utils.getInstance().printlnGreen(
                "Thread: " + Thread.currentThread().getName() + " 取款成功, 余额: " + amount);
    }
}