/*
 * @Author: vetgn
 * @Date: 2022-05-08 17:42:45
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-08 17:52:21
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework10\Two\Geely.java
 * @Description: 
 * (3)定义吉利汽车Geely继承Car，重写getInfo()方法。
 * 
 */
package src.Homework10.Two;

public class Geely extends Car {

    public Geely() {
    }

    public Geely(String brand, double price) {
        super(brand, price);
    }

    @Override
    public String getInfo() {
        return super.toString();
    }

}
