package src.experice.one;

public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    /**
     * 取钱
     * @param amount
     */
    public void withdraw(double amount){
        this.balance=this.balance-amount;
        if(this.balance>=0){
        System.out.println("您的存款为" + this.getBalance());
        }else if(this.balance<0){
            System.out.print("您的存款不足！");
            System.out.println("您现在的余额为" + (this.balance+amount));

        }
    }

    /**
     * 存钱
     * @param amount
     */
    public void deposit(double amount){
        this.balance =this.balance + amount;
        System.out.println("您的存款为" + this.getBalance());

    }

}
