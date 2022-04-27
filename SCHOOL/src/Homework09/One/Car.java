/*
 * @Author: vetgn
 * @Date: 2022-04-27 19:23:25
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 20:18:09
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\One\Car.java
 * @Description: 
 * 定义汽车类Car,要求如下：
 * (1)私有成员变量包括汽车品牌brand，排气量emission和价格price；
 * (2)定义一个构造方法初始化所有成员变量；
 * (3)定义getBrand()方法返回品牌信息;
 * (4)功能方法包括：starting()方法启动发动机。
 * 
 */
package src.Homework09.One;

public class Car {
    // (1)私有成员变量包括汽车品牌brand，排气量emission和价格price；
    private String brand;// 汽车品牌
    private double emission;// 排气量
    private String price;

    // (2)定义一个构造方法初始化所有成员变量；
    public Car() {
    }

    public Car(String brand, double emission, String price) {
        this.brand = brand;
        this.emission = emission;
        this.price = price;
    }

    /**
     * (3)定义getBrand()方法返回品牌信息;
     * 
     * @return
     */
    public String getBrand() {
        return  "汽车品牌:"+brand + "\t" + "排气量:" + emission + "\t" + "价格:" + price;
    }


    /**
     * (4)功能方法包括：starting()方法启动发动机。
     */
    public String starting() {
        return "启动" + brand + "汽车";
    }
}
