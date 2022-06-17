/*
 * @Author: vetgn
 * @Date: 2022-04-18 21:34:18
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-18 21:37:07
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\HomeWord07\Two\Screen.java
 * @Description: 
 * （2）Screen类，包含私有属性：品牌brand（String类型）和价格price（double类型）；带有两个参数的构造方法；getBrand()和getPrice()方法
 * 
 */
package src.Homework07.Two;

public class Screen {
    private String brand;
    private double price;

    public Screen() {
    }

    public Screen(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
