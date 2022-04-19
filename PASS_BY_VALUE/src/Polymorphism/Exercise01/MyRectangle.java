package src.Polymorphism.Exercise01;

public class MyRectangle extends GeometricObject {
    double width;
    double height;

    public MyRectangle(double width, double height, String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 计算矩形的面积
     * 
     * @return
     */
    public double findArea() {
        return height * width;
    }
}
