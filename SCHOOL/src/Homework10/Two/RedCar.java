/*
 * @Author: vetgn
 * @Date: 2022-05-08 17:42:33
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-08 17:52:03
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework10\Two\RedCar.java
 * @Description: 
 * (2)定义红旗汽车RedCar继承Car，重写getInfo()方法。
 */
package src.Homework10.Two;

public class RedCar extends Car {

    public RedCar() {
    }

    public RedCar(String brand, double price) {
        super(brand, price);
    }

    @Override
    public String getInfo() {
        return super.toString();
    }

}
