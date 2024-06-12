package com.homework.third.question_three;
/**
 * 测试类
 * 银行卡分为信用卡和借记卡，都有卡号和姓名，都具有取款及显示余额的功能。信用卡可根据每张卡不同的取现额度支取现金，取现时需要支付1%的手续费。
 * 借记卡 内余额大于0时可支取现金，支取额度不超过卡内余额。 花花同学信用卡额度为5000元，借记卡内余额为2000元。母亲节时花花使用信用卡取现购
 * 买保健品花费3500元，用借记卡为母亲购买鲜花花费110元。
 * 请计算花花同学母亲节时共花费多少元，并显示信用卡及借记卡内余额。分析题意，利用抽象类及抽象方法解决此问题。
 */
public class ExpendTest {
    public static void main(String[] args) {
        ExpendTest expendTest = new ExpendTest();

        CreditCard creditCard = new CreditCard("10001","花花",5000,0.01);
        DebitCard debitCard = new DebitCard("10002","花花",2000);

        System.out.println("花花使用信用卡购买保健品，花费3500元");
        expendTest.judgeOperate(creditCard.withdraw(3500));

        System.out.println("花花使用借记卡为母亲购买鲜花，花费110元");
        expendTest.judgeOperate(debitCard.withdraw(110));
        System.out.println();

        creditCard.getInfo();
        System.out.println();
        debitCard.getInfo();


    }
    public void judgeOperate(boolean isFlag) {
        if(isFlag) {
            System.out.println("操作成功");
        }else {
            System.out.println("操作失败");
        }
    }
}
