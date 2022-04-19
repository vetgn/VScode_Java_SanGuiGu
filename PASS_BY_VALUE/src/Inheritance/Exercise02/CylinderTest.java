package src.Inheritance.Exercise02;

public class CylinderTest {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.1);
        cylinder.setLength(3.4);
        System.out.println("圆柱的面积为" + cylinder.findVolume());
    }
}
