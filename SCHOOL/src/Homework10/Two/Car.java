/*
 * @Author: vetgn
 * @Date: 2022-05-08 17:41:49
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-08 17:58:31
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework10\Two\Car.java
 * @Description: 
 * 2. 简单汽车销售市场。
 * 在汽车4S店，顾客指定需要购买的车型，然后商家在汽车生产厂家提取该车型的汽车：
 * 
 * (1)定义抽象类Car，成员变量品牌brand和价格price，
 * 构造方法能够初始化所有成员变量，省略setter和getter方法，
 * 重写toString()方法返回有意义的汽车信息，抽象方法getInfo()返回汽车信息。
 */
package src.Homework10.Two;

public abstract class Car {
    // 成员变量
    private String brand;// 品牌
    private double price;// 价格

    // 构造方法能够初始化所有成员变量，省略setter和getter方法

    public Car() {
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // 重写toString()方法

    /**
     * 返回有意义的汽车信息
     */
    @Override
    public String toString() {
        return "brand: " + brand + "\tprice: " + price;
    }

    // 抽象方法getInfo()返回汽车信息
    
    /**
     * 返回汽车信息
     * 
     * @return
     */
    public abstract String getInfo();
}
