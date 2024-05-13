package com.experiment.e3;

/**
 * @author uncle_yumo
 * @CreateDate 2024/4/22
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
abstract class BankCard {
    private String cardId;
    private String userName;
    private double balance;

    public BankCard(String cardId, String userName, double balance) {
        this.cardId = cardId;
        this.userName = userName;
        this.balance = balance;
    }

    // 存款
    public abstract boolean deposit(double money);

    // 取款
    public abstract boolean withdraw(double money);

    // 显示银行卡信息
    public abstract void getInfo();

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
