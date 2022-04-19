/*
 * @Author: vetgn
 * @Date: 2022-04-18 21:24:46
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-18 21:31:43
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\HomeWord07\One\Test.java
 * @Description: 
 * 在主函数中，测试创建CheeseBurgerComboMeal对象（先创建吉士汉堡、可乐、薯条对象，并传入CheeseBurgerComboMeal构造方法）
 * 并调用CheeseBurgerComboMeal的showMessage输出：
 * 欢迎选用吉士汉堡套餐：
 * 吉士汉堡：5寸；单价15元；
 * 可乐：500ML， 单价8元；
 * 薯条：large，单价8元；
 * 套餐优惠价：22元，为您节省：9元。
 * 
 */
package src.HomeWord07.One;

public class Test {
    public static void main(String[] args) {
        CheeseBurger cheeseBurger = new CheeseBurger(5, 15);
        Cola cola= new Cola(500, 8);
        FrenchFries frenchFries = new FrenchFries("large", 8);
        CheeseBurgerComboMeal cheeseBurgerComboMeal = new CheeseBurgerComboMeal(cheeseBurger, cola, frenchFries);
        cheeseBurgerComboMeal.showMessage();
        
    }
}
