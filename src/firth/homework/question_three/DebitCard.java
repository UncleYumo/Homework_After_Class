package firth.homework.question_three;

/**
 * 借记卡
 */
public class DebitCard extends BankCard{
    private double balance; //余额

    public DebitCard(String cardNumber,String userName,double balance) {
        super(cardNumber,userName);
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 存款
     * @param money 需要取款的金额
     * @return true:取款成功 false:取款失败
     */
    @Override
    public boolean withdraw(double money) {
        if(money <= getBalance()) {
            setBalance(getBalance() - money);
            return true;
        }
        return false;
    }

    /**
     * 存款
     * @param money 需要存款的金额
     * @return true:存款成功 false:存款失败
     */
    @Override
    public boolean deposit(double money) {
        if(money > 0) {
            setBalance(getBalance() + money);
            return true;
        }
        return false;
    }

    @Override
    public void getInfo() {
        System.out.println("持卡人：" + getUserName());
        System.out.println("信用卡号：" + getCardNumber());
        System.out.println("账户余额：" + getBalance());
    }
}
