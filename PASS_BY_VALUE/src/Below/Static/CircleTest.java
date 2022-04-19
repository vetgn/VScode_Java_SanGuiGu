package src.Below.Static;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println("c1的id为" + c1.getId());
        System.out.println("c2的id为" + c2.getId());

        System.out.println("创建的圆的个数为：" + Circle.getTotal());
    }
}

class Circle {
    private double radius;
    private int id;

    private static int total;// 记录创建的圆的个数
    private static int init = 1001;// static声明的属性被所有对象共享

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();// 去运行public Circle()
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setInit(int init) {
        Circle.init = init;
    }

}