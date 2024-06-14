package com.homework.ninth;

import com.homework.ninth.TicketSeller;

class Customer extends Thread {
    private int payment;

    public Customer(String name, int payment) {
        super(name);
        this.payment = payment;
    }

    @Override
    public void run() {
        TicketSeller seller = new TicketSeller();
        boolean result = seller.sellTicket(payment);
        if (!result) {
            System.out.println(getName() + " 未能成功购票。");
        }
    }
}

public class TicketOfficeSimulation {
    public static void main(String[] args) throws InterruptedException {
        Customer zhang = new Customer("张某", 20);
        Customer li = new Customer("李某", 10);
        Customer zhao = new Customer("赵某", 5);

        // 控制线程执行顺序
        zhang.start();
        zhang.join();
        li.start();
        li.join();
        zhao.start();
        zhao.join();
    }
}
