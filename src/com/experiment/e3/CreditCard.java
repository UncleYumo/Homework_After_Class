package com.experiment.e3;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/22
 * @School 无锡学院
 * @StudentID 22344131
 * @Description 信用卡，取现时需要支付1%的手续费
 */
public class CreditCard extends BankCard{
    
    private double line_of_credit;
    
    public CreditCard(String cardId, String userName, double balance,double line_of_credit) {
        super(cardId, userName, balance);
        this.line_of_credit = line_of_credit;
    }
    @Override
    public boolean deposit(double money) {
        if(money <= 0) {
            System.out.println("存款金额不能为负数或零！存款失败！");
            return false;
        }
        setBalance(getBalance() + money);
        System.out.println("存款成功！");
        return true;
    }

    @Override
    public boolean withdraw(double money) {
        double totalCost = money * 1.01;
        if(getBalance() + getLine_of_credit() < totalCost) {
            System.out.println("余额与信用额度不足！取款失败！");
            return false;
        }
        if(getBalance() < totalCost) {
            setLine_of_credit(totalCost - getBalance());
            setBalance(0);
            System.out.println("使用了信用额度！取款成功！");
            return true;
        }
        setBalance(getBalance() - totalCost);
        System.out.println("取款成功！");
        return true;
    }

    @Override
    public void getInfo() {
        System.out.println("持卡人：" + getUserName());
        System.out.println("信用卡号：" + getCardId());
        System.out.println("账户余额：" + getBalance());
        System.out.println("信用额度：" + getLine_of_credit());
    }

    public double getLine_of_credit() {
        return line_of_credit;
    }

    public void setLine_of_credit(double line_of_credit) {
        this.line_of_credit = line_of_credit;
    }
}
