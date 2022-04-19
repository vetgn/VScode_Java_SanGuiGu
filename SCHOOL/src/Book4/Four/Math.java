/*
 * @Author: vetgn
 * @Date: 2022-04-11 15:49:26
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-11 16:02:22
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Book4\Four\Math.java
 * @Description: 
 * 
 */
package src.Book4.Four;

public class Math {
    private int a, b;

    public Math() {
    }

    public Math(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * @description: 分数的加
     * @param {*}
     * @return {*}
     */
    public double Add(int x) {
        return a / (b*1.0) + x;
    }

    /**
     * @description: 分数的减
     * @param {*}
     * @return {*}
     */
    public double Subtract(int x) {
        return a / (b*1.0) - x;
    }

    /**
     * @description: 分数的乘
     * @param {*}
     * @return {*}
     */
    public double Ride(int x) {
        return (a / (b*1.0)) * x;
    }

    /**
     * @description: 分数的除
     * @param {*}
     * @return {*}
     */
    public double Divide(int x) {
        return (a / (b*1.0)) / x;
    }

    public static void main(String[] args) {
        Math math = new Math(2, 3);
        // 加
        System.out.println("加：" + math.Add(1));
        // 减
        System.out.println("减：" + math.Subtract(1));
        // 乘
        System.out.println("乘：" + math.Ride(3));
        // 除
        System.out.println("除：" + math.Divide(3));
    }
}
/*
 * @Author: vetgn
 * 
 * @Date: 2022-04-11 15:49:26
 * 
 * @LastEditors: vetgn
 * 
 * @LastEditTime: 2022-04-11 15:50:54
 * 
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Book4\Four\Math.java
 * 
 * @Description: 实现分数的加减乘除
 * 
 */
