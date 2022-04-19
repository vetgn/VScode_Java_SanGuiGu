package src.Inheritance.Exercise04;

public class Account {
    private int id;// 客户的账号
    private double balance;// 客户的余额
    private double annuallnterestRate;// 年利率

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    /**
     * 返回月利率
     * 
     * @return
     */
    public double geyMothlyInterest() {
        return 0;
    }

    /**
     * 取款方法
     * 
     * @param amount
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("您的余额为" + balance);
        } else {
            System.out.println("您的余额不够" + "您的余额为" + balance);
        }
    }

    /**
     * 存款方法
     * 
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;
        System.out.println("您的余额为" + balance);
    }

}
