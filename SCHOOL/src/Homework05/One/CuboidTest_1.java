package src.Homework05.One;

public class CuboidTest_1 {
    public static void main(String[] args) {
        //(1)利用空构造方法创建一个新的长方体对象cuboidA
        Cuboid cuboidA = new Cuboid();

        //利用setter方法设置长宽高分别为1.5、2.6和18.6
        cuboidA.setLength(1.5);//长
        cuboidA.setWidth(2.6);//宽
        cuboidA.setHeight(18.6);//高

        //调用printCuboid()方法输出cuboidA的基本信息
        cuboidA.printCuboid();
        //调用isCube()方法判断是否正方体
        System.out.println("该图形是否是正方形：" + cuboidA.isCube());
        
        //调用方法drawing()模拟绘制该长方体
        cuboidA.drawing();
        
    }
}
