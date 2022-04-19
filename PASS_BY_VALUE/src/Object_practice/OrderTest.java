package src.Object_practice;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001, "AA");
        Order order2 = new Order(1001, "BB");
        System.out.println(order1.equals(order2));//false
        Order order3 = new Order(1001, "BB");
        System.out.println(order2.equals(order3));//true


    }
}

class Order {
    protected int orderld;
    protected String orderName;


    
    public Order(int orderld, String orderName) {
        this.orderld = orderld;
        this.orderName = orderName;
    }

    public int getOrderld() {
        return orderld;
    }

    public void setOrderld(final int orderld) {
        this.orderld = orderld;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(final String orderName) {
        this.orderName = orderName;
    }

    /**
     * 重写方法
     */
    public boolean equals( Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Order) {
            Order order = (Order) obj;
            return this.orderld == order.orderld && this.orderName.equals(order.orderName);
            
        }
        return false;
    }

}
