package src.Inheritance.Exercise02;

public class Cylinder extends Circle{
    private double length;

    public Cylinder(){
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 返回圆柱的面积
     * @return
     */
    public double findVolume(){
        return findArea()*length;
    }
}
