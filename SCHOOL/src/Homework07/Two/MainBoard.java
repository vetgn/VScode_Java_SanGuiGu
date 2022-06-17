/*
 * @Author: vetgn
 * @Date: 2022-04-18 21:33:52
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-18 21:36:43
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\HomeWord07\Two\MainBoard.java
 * @Description:  
 *（1）MainBoard类，包含私有属性：品牌brand（String类型）和价格price（double类型）；带有两个参数的构造方法；getBrand()和getPrice()方法
 * 
 */
package src.Homework07.Two;

public class MainBoard {
    private String brand;
    private double price;

    public MainBoard() {
    }

    public MainBoard(String brand, double price) {
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
