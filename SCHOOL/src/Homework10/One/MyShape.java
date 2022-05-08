/*
 * @Author: vetgn
 * @Date: 2022-05-08 17:08:47
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-08 17:28:39
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework10\MyShape.java
 * @Description: 
 * (4)定义类MyShape，
 * 该类中定义静态方法area(Shape shape)能够计算任何图形的表面积，
 * 静态方法perimeter(Shape shape)能够计算任何图形的周长，
 * 静态方法drawing(Shape shape)能够绘制任何图形。
 */
package src.Homework10.One;

public class MyShape {

    // 该类中定义静态方法area(Shape shape)能够计算任何图形的表面积

    /**
     * 计算任何图形的表面积
     * 
     * @param shape
     * @return
     */
    public static double area(Shape shape) {
        return shape.getArea();
    }

    // 静态方法perimeter(Shape shape)能够计算任何图形的周长

    /**
     * 计算任何图形的周长
     * 
     * @param shape
     * @return
     */
    public static double perimeter(Shape shape) {
        return shape.getPerimeter();
    }

    // 静态方法drawing(Shape shape)能够绘制任何图形。

    /**
     * 绘制任何图形
     * 
     * @param shape
     */
    public static void drawing(Shape shape) {
        shape.drawing();
    }
}
