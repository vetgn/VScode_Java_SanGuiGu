/*
 * @Author: vetgn
 * @Date: 2022-04-11 16:07:34
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-11 16:14:01
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Book4\Five\Plural.java
 * @Description: 复数的计算方法
 * 
 */
package src.Book4.Five;

public class Plural {
    private int a, b;// a 为实数 b 为虚数

    public Plural() {
    }

    public Plural(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * @description: 复数的加
     * @param {*}
     * @return {*}
     */
    public String Add(int x, int y) {
        return "加的结果:   " + (a + x) + " + " + (b + y) + "i";
    }

    /**
     * @description: 复数的减
     * @param {*}
     * @return {*}
     */
    public String Subtract(int x, int y) {
        return "减的结果:   " + (a - x) + " + " + (b - y) + "i";
    }

    /**
     * @description: 复数的乘
     * @param {*}
     * @return {*}
     */
    public String Ride(int x, int y) {
        return "乘的结果:   " + (a * x - b * y) + " + " + (b * x + a * y) + "i";
    }

    public static void main(String[] args) {
        Plural plural = new Plural(1, 2);

        System.out.println(plural.Add(1, 2));

        System.out.println(plural.Subtract(1, 2));

        System.out.println(plural.Ride(2, 2));
    }
}
