package src.project01;

/*
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和height，同时声明公共方法访问私有变量。‘
 * 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形面积。
 * 
 */
public class TriAngle {
    private double base;// 边长
    private double height;// 高

    public TriAngle() {

    }

    public TriAngle(double b, double h) {
        System.out.println("三角形面积为" + b * h / 2);
    }

    public void setbase(int b) {
        base = b;
    }

    public double getbase() {
        return base;
    }

    public void setheight(int h) {
        height = h;
    }

    public double getheight() {
        return height;
    }
}
