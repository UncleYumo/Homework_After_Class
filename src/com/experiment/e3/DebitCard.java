package com.experiment.e3;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/22
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class DebitCard extends BankCard{
    public DebitCard(String cardId, String userName, double balance) {
        super(cardId, userName, balance);
    }

    @Override
    public boolean deposit(double money) {
        if(money <= 0) {
            System.out.println("存款金额不能为负数或零！");
            return false;
        }
        setBalance(getBalance() + money);
        System.out.println("存款成功");
        return true;
    }


    @Override
    public boolean withdraw(double money) {
        if(getBalance() < money) {
            System.out.println("余额不足！");
            return false;
        }
        setBalance(getBalance() - money);
        System.out.println("取款成功");
        return true;
    }

    @Override
    public void getInfo() {
        System.out.println("持卡人：" + getUserName());
        System.out.println("信用卡号：" + getCardId());
        System.out.println("账户余额：" + getBalance());
    }
}
