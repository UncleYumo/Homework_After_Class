package com.homework.third.question_three;

/**
 * 信用卡
 */
public class CreditCard extends BankCard{
    private double overdraftBalance; //透支余额
    private double serviceCharge; //手续费

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public CreditCard(String cardNumber, String userName, double overdraftBalance , double serviceCharge) {
        super(cardNumber,userName);
        this.overdraftBalance = overdraftBalance;
        this.serviceCharge = serviceCharge;
    }

    /**
     * 获取信用卡的当前透支余额
     * @return 透支余额
     */
    public double getOverdraftBalance() {
        return overdraftBalance;
    }

    public void setOverdraftBalance(double overdraftBalance) {
        this.overdraftBalance = overdraftBalance;
    }

    /**
     * 存款
     * @param money 需要存款的金额
     * @return true:存款成功 false:存款失败
     */
    @Override
    public boolean deposit(double money) {
        if(money > 0) {
            setOverdraftBalance(getOverdraftBalance() + money);
        }
        return false;
    }

    /**
     * 取款，需要计算手续费：serviceCharge
     * @param money 需要取款的金额
     * @return true:取款成功 false:取款失败
     */
    @Override
    public boolean withdraw(double money) {
        double amountNeeded = money + (money * getServiceCharge());
        if(amountNeeded <= getOverdraftBalance()) {
            setOverdraftBalance(getOverdraftBalance() - amountNeeded);
            return true;
        }
        return false;
    }

    @Override
    public void getInfo() {
        System.out.println("持卡人：" + getUserName());
        System.out.println("信用卡号：" + getCardNumber());
        System.out.println("透支余额：" + getOverdraftBalance());
        System.out.println("取款手续费率：" + getServiceCharge());
    }
}
