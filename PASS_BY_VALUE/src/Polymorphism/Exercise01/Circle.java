package src.Polymorphism.Exercise01;

public class Circle extends GeometricObject {
    double radius;

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     */
    public double findArea() {
        return Math.PI*radius*radius;
    }
}
