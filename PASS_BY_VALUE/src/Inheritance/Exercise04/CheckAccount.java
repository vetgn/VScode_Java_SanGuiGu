package src.Inheritance.Exercise04;

/**
 * 为可透支账户
 */
public class CheckAccount extends Account {
    private int overdraft;// 可透支额度

    public CheckAccount(int id, double balance, double annuallnterestRate, int overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }

    /**
     * 取款方法
     * 
     * @param amount
     */
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            // 方法一
            // setBalance(getBalance() - amount);

            // 方法二
            super.withdraw(amount);
            System.out.println("您的可透支余额为" + overdraft);
        } else if (overdraft >= amount - getBalance()) {
            System.out.println("您的余额为" + 0 + "您透支的额度为" + (overdraft -= (amount - getBalance())));
            setBalance(0);
        } else {
            System.out.println("超过可透支额的限额!");
        }
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    
}
