package src.Homework05.One;

public class CuboidTest_2 {
    public static void main(String[] args) {
        // 利用构造方法创建一个具有长宽高分别为2.5、6.8和8.0的长方体对象cuboidB
        Cuboid cuboidB = new Cuboid(2.5, 6.8, 8.0);

        // 利用setLength()方法修改length为4.6
        cuboidB.setLength(4.6);

        // 调用getArea()方法计算表面积
        System.out.println("该图形的表面积为" + cuboidB.getArea());

        //调用getCubage计算该长方体的体积
        System.out.println("该图形的体积为" + cuboidB.getCubage());
    }
}
