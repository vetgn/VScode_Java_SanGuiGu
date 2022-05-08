/*
 * @Author: vetgn
 * @Date: 2022-05-08 17:08:25
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-08 17:18:32
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework10\Rectangle.java
 * @Description: 
 * (2)定义长方形类Rectangle实现接口Shape，成员变量包括长length和宽width，
 * 定义一个初始化所有成员变量的构造方法，重写toString()返回长方形的length和width，并重写接口中的方法。
 */
package src.Homework10.One;

public class Rectangle implements Shape {
    // 成员变量包括长length和宽width
    private double length;// 长
    private double width;// 宽

    // 定义一个初始化所有成员变量的构造方法
    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 重写toString()

    /**
     * 返回长方形的length和width
     */
    @Override
    public String toString() {
        return "length: " + length + "\twidth:" + width;
    }

    // 并重写接口中的方法

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void drawing() {
        System.out.println("正在绘制一个长方形" + toString());
    }

}
