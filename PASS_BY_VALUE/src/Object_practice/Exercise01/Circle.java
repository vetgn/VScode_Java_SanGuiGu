package src.Object_practice.Exercise01;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Circle) {
            Circle oCircle = (Circle) obj;
            return this.radius == oCircle.radius;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}
