package com.homework.ninth;

public class TicketSeller {
    private int balance = 15; // 售票员初始有3张5元，共15元。

    public synchronized boolean sellTicket(int payment) {
        if (payment < 5) {
            System.out.println(Thread.currentThread().getName() + " 支付的钱不够买票。");
            return false;
        }
        int change = payment - 5;
        if (balance < change) {
            System.out.println(Thread.currentThread().getName() + " 现金不足，无法找零：" + change + "元。");
            return false;
        }
        balance += 5;
        balance -= change;

        System.out.println(Thread.currentThread().getName() + " 成功购票。支付了" + payment + "元，找零" + change + "元。");
        return true;
    }
}
