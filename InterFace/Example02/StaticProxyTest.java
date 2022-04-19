package Example02;

public class StaticProxyTest {
    public static void main(String[] args) {
        Star s = new Proxy(new RealStar());
        s.confer();
        s.signContract();
        s.bookTicket();
        s.sing();
        s.collectMoney();
    }
}

/**
 * 相当于给明星规定了一些行为准则
 */
interface Star {
    void confer();// 面谈

    void signContract();// 签合同

    void bookTicket();// 订票

    void sing();// 唱歌

    void collectMoney();// 收钱

}

// 被代理类
/**
 * 相当于明星根据准则干的事，但是除了sing以外其他的事是不用负责的
 */
class RealStar implements Star {

    @Override
    public void confer() {
        // TODO Auto-generated method stub

    }

    @Override
    public void signContract() {
        // TODO Auto-generated method stub

    }

    @Override
    public void bookTicket() {
        // TODO Auto-generated method stub

    }

    @Override
    public void sing() {
        // TODO Auto-generated method stub
        System.out.println("明星唱歌~~~");
    }

    @Override
    public void collectMoney() {
        // TODO Auto-generated method stub

    }
}

// 代理类
/**
 * 相当于这些事都是经纪人来做
 */
class Proxy implements Star {

    private Star real;

    public Proxy(Star real) {
        this.real = real;
    }

    @Override
    public void confer() {
        // TODO Auto-generated method stub
        System.out.println("经纪人面谈");
    }

    @Override
    public void signContract() {
        // TODO Auto-generated method stub
        System.out.println("经纪人签合同");
    }

    @Override
    public void bookTicket() {
        // TODO Auto-generated method stub
        System.out.println("经纪人订票");
    }

    @Override
    public void sing() {
        // TODO Auto-generated method stub
        real.sing();// 转到明星去做
    }

    @Override
    public void collectMoney() {
        // TODO Auto-generated method stub
        System.out.println("经纪人收钱");
    }

}