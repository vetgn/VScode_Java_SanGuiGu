package src.Below.Exercise01;

/**
 * 编写一个类实现银行账户的概念，包含的属性有账号、密码、存款余额、利率、最小余额，
 * 顶替封装这些属性的方法，账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息
 * 考虑：哪些属性可以设计成static属性。
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account("123213", 2000);

        Account.setInterestRate(0.012);
        Account.setMinMoney(100);

        System.out.println(account1);
        System.out.println(account2);

        System.out.println(Account.getInterestRate());
        System.out.println("id为");
        System.out.println(account1.getId());
        System.out.println(account2.getId());
        
        System.out.println("pwd为");
        System.out.println(account1.getPwd());
        System.out.println(account2.getPwd());

    }
}