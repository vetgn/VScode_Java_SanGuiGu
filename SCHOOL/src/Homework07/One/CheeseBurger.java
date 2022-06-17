/*
 * @Author: vetgn
 * @Date: 2022-04-18 21:12:35
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-31 10:45:03
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework07\One\CheeseBurger.java
 * @Description: 
 * 某炸鸡快餐推出一个吉士汉堡套餐CheeseBurgerComboMeal：它由吉士汉堡CheeseBurger+可乐Cola+薯条FrenchFries组成，其中：
 * 吉士汉堡有size(尺寸);price属性；
 * 可乐有volume(容量);price属性；
 * 薯条有type（large, medium, small）和price属性。
 * CheeseBurgerComboMeal本身也有一个价格属性。
 * 所有数据访问属性均为private。为此需要公开get方法。
 * CheeseBurgerComboMeal中有一个showMessage方法。
 * 在主函数中，测试创建CheeseBurgerComboMeal对象（先创建吉士汉堡、可乐、薯条对象，并传入CheeseBurgerComboMeal构造方法）
 * 并调用CheeseBurgerComboMeal的showMessage输出：
 * 欢迎选用吉士汉堡套餐：
 * 吉士汉堡：5寸；单价15元；
 * 可乐：500ML， 单价8元；
 * 薯条：large，单价8元；
 * 套餐优惠价：22元，为您节省：9元。
*/
package src.Homework07.One;

//吉士汉堡
public class CheeseBurger {
    private int size;// 尺寸
    private int price;

    public CheeseBurger() {
    }

    public CheeseBurger(int size, int price) {
        this.size = size;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
