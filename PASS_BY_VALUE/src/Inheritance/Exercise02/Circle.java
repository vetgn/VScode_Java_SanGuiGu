package src.Inheritance.Exercise02;

public class Circle {
    private double radius;

    public Circle(){
        this.radius  = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     * @return
     */
    public double findArea(){
        return (Math.PI*Math.pow(radius, 2));
    }
}
