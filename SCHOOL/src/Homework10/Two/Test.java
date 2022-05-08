/*
 * @Author: vetgn
 * @Date: 2022-05-08 17:43:07
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-08 18:09:56
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework10\Two\Test.java
 * @Description: 
 * 定义测试类，完成如下任务：顾客购买红旗和吉利汽车，
 * 调用CarFactory中的getCar(String name)的方法，输入汽车型号和价格，然后输出汽车信息。
 */
package src.Homework10.Two;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("请输入红旗汽车的型号:");
            String red_brand = scanner.next();
            CarFactory.getCar(red_brand);

            System.out.print("请输入吉林汽车的型号:");
            String geel_brand = scanner.next();
            CarFactory.getCar(geel_brand);
        }
    }
}
