/*
 * @Author: vetgn
 * @Date: 2022-04-24 14:37:16
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-24 14:41:00
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework08\Publication.java
 * @Description: 
 * 2．书（Book）派生于出版物（Publication）。其中：
 * （1）Publication：有三个私有成员变量：出版物名字name（String 类型）、出版物编号ISBN_NO（String 类型）、价格price（double 类型）；
 * 带3个参数的构造方法；一个showMessage()空方法。
 */
package src.Homework08.Two;

public class Publication {
    // （1）Publication：有三个私有成员变量：出版物名字name（String 类型）、出版物编号ISBN_NO（String
    // 类型）、价格price（double 类型）
    private String name;
    private String ISBN_NO;
    private double price;

    // 带3个参数的构造方法
    public Publication() {
    }

    public Publication(String name, String iSBN_NO, double price) {
        this.name = name;
        ISBN_NO = iSBN_NO;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN_NO() {
        return ISBN_NO;
    }

    public void setISBN_NO(String iSBN_NO) {
        ISBN_NO = iSBN_NO;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 一个showMessage()空方法
    public void showMessage() {

    }
}
