package com.experiment.e3;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/22
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class BankTest {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("CREDITCARD-信用卡","花花",0,5000);
        DebitCard debitCard = new DebitCard("DEBITCARD-借记卡","花花",2000);
        creditCard.getInfo();
        System.out.println();
        debitCard.getInfo();
        System.out.println();
        System.out.println("使用信用卡购买保健品花费3500元");
        creditCard.withdraw(3500);
        creditCard.getInfo();
        System.out.println();
        System.out.println("使用借记卡为母亲购买鲜花花费200元");
        debitCard.withdraw(200);
        debitCard.getInfo();
    }
}
