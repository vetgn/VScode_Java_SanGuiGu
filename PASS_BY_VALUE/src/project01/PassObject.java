package src.project01;

public class PassObject {
    public static void main(String[] args) {
        PassObject p1 = new PassObject();
        Circle c = new Circle();
        p1.printAreas(c, 5);
    }

    public void printAreas(Circle c, int time) {
        System.out.println("radius" + "\t" + "Area");
        for (int i = 1; i <= time; i++) {
            c.radius = i;
            double area = c.fingArea();
            System.out.println(c.radius + "\t" + area);
        }
    }
}

class Circle {
    double radius;

    public double fingArea() {
        return Math.PI * radius * radius;
    }
}
