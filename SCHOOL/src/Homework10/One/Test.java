/*
 * @Author: vetgn
 * @Date: 2022-05-08 17:08:52
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-08 18:27:35
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework10\One\Test.java
 * @Description: 
 * 定义测试类，完成如下任务：通过MyShape中的area(Shape shape)方法取得一个圆和长方形的面积，
 * 通过perimeter(Shape shape)方法取得一个圆和长方形周长，
 * 调用drawing(Shape shape)绘制一个圆和长方形。运行结果如图10-1所示。
 */
package src.Homework10.One;

public class Test {
    public static void main(String[] args) {

        Shape c = new Circle(10.0);
        Shape r = new Rectangle(10.0, 20.0);
        // 通过MyShape中的area(Shape shape)方法取得一个圆和长方形的面积
        System.out.println("圆面积为：" + MyShape.area(c));
        System.out.println("长方形面积为：" + MyShape.area(r));

        // 通过perimeter(Shape shape)方法取得一个圆和长方形周长

        System.out.println("圆的周长：" + MyShape.perimeter(c));
        System.out.println("长方形的周长：" + MyShape.perimeter(r));

        // 调用drawing(Shape shape)绘制一个圆和长方形

        MyShape.drawing(c);
        MyShape.drawing(r);
    }
}
