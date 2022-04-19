package src;

public class circle {
    public static void main(String[] args) {
        area a1 = new area();// 进行调用
        System.out.println(a1.findarea(2));// 进行输出
    }
}

// 定义圆的面积
class area {

    public double findarea(double r) {
        return (Math.PI * Math.pow(r, 2));
    }
}