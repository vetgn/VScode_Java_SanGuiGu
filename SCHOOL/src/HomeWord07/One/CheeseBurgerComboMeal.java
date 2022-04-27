/*
 * @Author: vetgn
 * @Date: 2022-04-18 21:17:14
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-18 21:31:11
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\HomeWord07\One\CheeseBurgerComboMeal.java
 * @Description: 
 * 
 */
package src.Homeword07.One;

public class CheeseBurgerComboMeal {
    private int price;
    private CheeseBurger cheeseBurger;
    private Cola cola;
    private FrenchFries frenchFries;

    public CheeseBurgerComboMeal() {
    }

    public CheeseBurgerComboMeal(int price) {
        this.price = price;
    }

    public CheeseBurgerComboMeal(CheeseBurger cheeseBurger, Cola cola, FrenchFries frenchFries) {
        this.cheeseBurger = cheeseBurger;
        this.cola = cola;
        this.frenchFries = frenchFries;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showMessage() {
        System.out.println("欢迎选用吉士汉堡套餐：");
        System.out.println("吉士汉堡：" + cheeseBurger.getSize() + "寸；单价" + cheeseBurger.getPrice() + "元");
        System.out.println("可乐：" + cola.getVolume() + "， 单价" + cola.getPrice() + "元");
        System.out.println("薯条：" + frenchFries.getType() + "，单价" + frenchFries.getPrice() + "元；");
        System.out.println("套餐优惠价：22元，为您节省：9元。");
    }

}
