package src.Homework05.One;

/* 定义长方体类Cuboid，要求如下：
（1）私有成员变量包括长length、宽width和高height；
（2）构造方法包括一个公共的空构造方法，一个能够初始化所有成员变量的构造方法；
（3）包括所有的setter和getter方法，其中setter方法要求对形参进行验证，例如长、宽和高都大于0；
（4）功能方法包括计算表面积getArea()、计算体积getCubage()、判断是否正方体isCube()、输出该长方体的长宽高printCuboid()、
    绘制该长方体（给出提示信息即可）drawing()。

测试一要求如下： 
(1)利用空构造方法创建一个新的长方体对象cuboidA，
然后利用setter方法设置长宽高分别为1.5、2.6和18.6，
(2)调用printCuboid()方法输出cuboidA的基本信息，
调用isCube()方法判断是否正方体；
(3)调用方法drawing()模拟绘制该长方体。

测试二要求如下：
(1)利用构造方法创建一个具有长宽高分别为2.5、6.8和8.0的长方体
对象cuboidB，然后利用setLength()方法修改length为4.6；
(2)调用getArea()方法计算表面积；
(3)调用getCubage计算该长方体的体积。 */
public class Cuboid {

    // 要求(1)
    private double length;// 长
    private double width;// 宽
    private double height;// 高

    // 要求(2)
    public Cuboid() {
    }

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // 要求(3)
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }
    /*
     * （4）功能方法包括计算表面积getArea()、计算体积getCubage()、判断是否正方体isCube()、输出该长方体的长宽高printCuboid
     * ()
     * 绘制该长方体（给出提示信息即可）drawing()。
     */

    /**
     * 计算表面积
     */
    public double getArea() {
        return length * height * 2 + length * width * 2 + width * height * 2;
    }

    /**
     * 计算体积
     * 
     * @return
     */
    public double getCubage() {
        return length * height * width;
    }

    /**
     * 判断是否是正方形
     * 
     * @return
     */
    public boolean isCube() {
        if (length == height && length == width) {
            return true;
        }
        return false;
    }

    /**
     * 输出长方体的长宽高
     */
    public void printCuboid() {
        System.out.println("长方体的长为" + this.length + "   " + "长方体的高为" + this.height + "   " + "长方体的宽为" + this.width);
    }

    /**
     * 绘制图形
     */
    public void drawing() {
        System.out.println("该长方体是长为" + this.length + "宽为" + this.width + "高为" + this.height + "的图形");
    }
}
