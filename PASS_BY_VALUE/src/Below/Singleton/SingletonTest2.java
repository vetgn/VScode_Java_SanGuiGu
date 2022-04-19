package src.Below.Singleton;

public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);
    }

}

// 懒汉式
class Order {
    // 1,私有化类的构造器
    private Order() {

    }

    // 2.声明当前类的构造器，没有初始化
    // 4.此对象也必须声明为static的
    private static Order instance = null;

    // 3.声明public、static的返回当前类对象的方法
    public static Order getInstance() {
        // 如果没有创建对象就创建一个新的对象
        if (instance == null) {
            instance = new Order();
        }
        // 如果已经创建一个对象，就继续返回原来的对象
        return instance;
    }
}