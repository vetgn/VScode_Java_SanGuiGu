/*
 * @Author: vetgn
 * @Date: 2022-04-11 15:20:56
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-12 09:30:38
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Book4\Three\Triangle.java
 * @Description: 
 * 
 */
package src.Book4.Three;

public class Triangle {
    private float x1, y1, x2, y2, x3, y3;// 三角形的三个顶点坐标

    public Triangle() {
    }

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    float p1, p2, p3;

    /**
     * @description: 计算三角形的周长
     * @param {float} x1
     * @param {float} y1
     * @param {float} x2
     * @param {float} y2
     * @param {float} x3
     * @param {float} y3
     * @return {*}
     */
    public float Perimeter() {

        p1 = (float) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        p2 = (float) Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        p3 = (float) Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        return p1 + p2 + p3;
    }

    /**
     * @description: 计算三角形面积
     * @param {float} x1
     * @param {float} y1
     * @param {float} x2
     * @param {float} y2
     * @param {float} x3
     * @param {float} y3
     * @return {*}
     */
    public float Area() {
        float p = (p1 + p2 + p3) / 3;
        return (float) Math.sqrt(p * (p - p1) * (p - p2) * (p - p3));
    }

    /**
     * @description: 三角形进行平移
     * @param {*}
     * @return {*}
     */
    public void Move(float x, float y) {
        x1 += x;
        x2 += x;
        x3 += x;
        y1 += y;
        y2 += y;
        y3 += y;
    }

    /**
     * @description: 三角形绕原点旋转180度
     * @param {*}
     * @return {*}
     */
    public void Spin() {
        x1 = -x1;
        x2 = -x2;
        x3 = -x3;
        y1 = -y1;
        y2 = -y2;
        y3 = -y3;
    }

    @Override
    public String toString() {
        return "坐标:\t(" + x1 + "," + y1 + ")  " + "(" + x2 + "," + y2 + ")  " + "(" + x3 + "," + y3 + ")";
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1f, 2f, 3f, 4f, 5f, 2f);

        System.out.println("三角形的面积为：" + triangle.Area());

        System.out.println("三角形的周长为：" + triangle.Perimeter());

        triangle.Move(1f, 1f);
        System.out.println(triangle);

        triangle.Spin();
        System.out.println(triangle);
    }
}
 