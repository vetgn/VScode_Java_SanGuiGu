package Exercise01;

interface CompareObject {
    public int CompareTo(Object o);

}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class CompareCircle extends Circle implements CompareObject {

    public CompareCircle(double radius) {
        super(radius);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int CompareTo(Object o) {
        // TODO Auto-generated method stub
        if (this == o) {
            return 0;
        }
        if (o instanceof CompareCircle) {
            CompareCircle c = (CompareCircle) o;
            if (this.getRadius() > c.getRadius()) {
                return 1;
            } else if (this.getRadius() < c.getRadius()) {
                return -1;
            } else {
                return 0;
            }
        } else {

            return 0;
        }

    }

}

public class InterfaceTest {
    public static void main(String[] args) {
        CompareCircle com1 = new CompareCircle(3.4);
        CompareCircle com2 = new CompareCircle(3.6);
        int compareValue = com1.CompareTo(com2);
        if (compareValue > 0) {
            System.out.println("com1大");
        }
        if (compareValue < 0) {
            System.out.println("com2大");
        } else {
            System.out.println("两个一样大");
        }
    }
}
