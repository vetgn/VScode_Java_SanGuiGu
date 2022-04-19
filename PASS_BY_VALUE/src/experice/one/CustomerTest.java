package src.experice.one;
//账号为1000,余额为2000，年率为1.23%，现存100，取960，再取2000
public class CustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer("Jane", "Smith");
        Account a = new Account(1000, 2000, 1.23);
        c.setAccount(a);//使得Account跟Customer有关系，使得二者之间串联起来
        c.getAccount().deposit(100);
        c.getAccount().withdraw(960);
        c.getAccount().withdraw(2000);
    }
}
