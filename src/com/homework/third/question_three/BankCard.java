package com.homework.third.question_three;
/**
 * 银行卡分为信用卡和借记卡，都有卡号和姓名，都具有取款及显示余额的功能。信用卡可根据每张卡不同的取现额度支取现金，取现时需要支付1%的手续费。
 * 借记卡 内余额大于0时可支取现金，支取额度不超过卡内余额。 花花同学信用卡额度为5000元，借记卡内余额为2000元。母亲节时花花使用信用卡取现购
 * 买保健品花费3500元，用借记卡为母亲购买鲜花花费110元。
 * 请计算花花同学母亲节时共花费多少元，并显示信用卡及借记卡内余额。分析题意，利用抽象类及抽象方法解决此问题。
 */
public abstract class BankCard {
    private String cardNumber;
    private String userName;

    public BankCard(String cardNumber,String userName){
        this.cardNumber = cardNumber;
        this.userName = userName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 取款
     * @param money 需要取款的金额
     * @return true:取款成功 false:取款失败
     */
    public abstract boolean withdraw(double money);

    /**
     * 存款
     * @param money 需要存款的金额
     * @return true:存款成功 false:存款失败
     */
    public abstract boolean deposit(double money);
    public abstract void getInfo();
}
