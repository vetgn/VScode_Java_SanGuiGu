package src.Inheritance.Exercise04;

/**
 * 写一个用户测试
 * 在用户程序中，创建一个账号为1122、余额为20000、年利率为4.5%，可透支余额为5000元的CheckAccount对象。
 * 使用withdraw方法提款5000元，并打印账户余额和可透支额。
 * 再使用withdraw方法提取18000元，并打印账户余额和可透支余额。
 * 再使用withdraw方法提取3000元，并打印账户余额和可透支余额。
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);
        checkAccount.withdraw(5000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(3000);

    }
}
