package src.project01;

public class TriAngleTest {
    public static void main(String[] args) { 
        TriAngle t = new TriAngle();
        t.setbase(12);
        t.setheight(0);
        System.out.println("base=" + t.getbase() + "height=" + t.getheight());
        //TriAngle t1 = new TriAngle(t.getbase(), t.getheight());

    }
}
