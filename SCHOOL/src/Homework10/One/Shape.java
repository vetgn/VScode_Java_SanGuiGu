/*
 * @Author: vetgn
 * @Date: 2022-05-08 17:07:24
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-08 17:26:32
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework10\Shape.java
 * @Description: 
 * 1. 平面几何图形的操作。
 * (1)定义接口Shape，该接口包含抽象方法getArea()计算表面积，抽象方法getPerimeter()计算周长，抽象方法drawing()表示绘制一个图形。
 * 
 */
package src.Homework10.One;

public interface Shape {
    /**
     * 计算表面积
     */
    double getArea();

    /**
     * 计算周长
     */
    double getPerimeter();

    /**
     * 表示绘制一个图形
     */
    void drawing();
}
