/*
 * @Author: vetgn
 * @Date: 2022-05-08 17:08:34
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-08 17:41:29
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework10\One\Circle.java
 * @Description: 
 * (3)定义圆类Circle实现Shape接口，成员变量半径radius，
 * 定义一个初始化所有成员变量的构造方法，重写toString()返回圆的半径radius，并重写接口中的方法。
 */
package src.Homework10.One;

public class Circle implements Shape {
    // 成员变量半径radius

    private double radius;// 半径

    // 定义一个初始化所有成员变量的构造方法

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    // 重写toString()

    /**
     * 返回圆的半径radius
     */
    @Override
    public String toString() {
        return "radius: " + radius;
    }

    // 并重写接口中的方法

    @Override
    public double getArea() {
        return  Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void drawing() {
        System.out.println("正在绘制一个圆" + toString());
    }

}
