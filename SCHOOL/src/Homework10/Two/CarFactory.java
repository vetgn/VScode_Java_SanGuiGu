/*
 * @Author: vetgn
 * @Date: 2022-05-08 17:42:54
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-08 18:32:19
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework10\Two\CarFactory.java
 * @Description: 
 * (4)定义汽车工厂类CarFactory,该类中有一个静态方法getCar(String name),
 * 根据用户指定的车型来创建对象，利用简单工厂模式完成
 */
package src.Homework10.Two;

import java.util.Scanner;

public class CarFactory {

    /**
     * 根据用户指定的车型来创建对象，利用简单工厂模式完成
     * 
     * @param name
     */
    public static void getCar(String name) {
        Scanner scanner = new Scanner(System.in);
        if (name.equals("红旗H5")) {
            System.out.print("请输入红旗汽车的价格:");
            double red_price = scanner.nextDouble();
            Car redcar = new RedCar(name, red_price);
            System.out.println(redcar.getInfo());
        }

        if (name.equals("博越")) {

            System.out.print("请输入吉林汽车的价格:");
            double geel_price = scanner.nextDouble();
            Car geelycar = new Geely(name, geel_price);
            System.out.println(geelycar.getInfo());
        }

    }
}
