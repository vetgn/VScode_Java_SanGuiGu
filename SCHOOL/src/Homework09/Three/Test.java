/*
 * @Author: vetgn
 * @Date: 2022-04-27 22:24:10
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 22:36:48
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\Three\Test.java
 * @Description: 
 * 
 */
package src.Homework09.Three;

public class Test {
    public static void main(String[] args) {
        // 创建低配汽车对象
        LowCar lowCar = new LowCar("宝马", 200);
        // 并输出该汽车的基本信息
        System.out.println(lowCar.toString());
        System.out.println();

        // 创建中配汽车对象
        MiddleCar middleCar = new MiddleCar("奔驰", 100);
        // 并输出该汽车的基本信息
        System.out.println(middleCar.toString());
        // 并调用蓝牙功能
        middleCar.bluetooth();
        System.out.println();

        // 创建高配汽车对象
        LuxuryCar luxuryCar = new LuxuryCar("法拉利", 400);
        // 并输出该汽车的基本信息
        System.out.println(luxuryCar.toString());
        // 调用蓝牙功能
        luxuryCar.bluetooth();
        // 利用GPS进行定位
        luxuryCar.gps();
        // 建立与其它汽车的的IOV连接
        luxuryCar.iov();
    }
}
