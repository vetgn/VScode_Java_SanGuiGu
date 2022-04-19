/*
 * @Author: vetgn
 * @Date: 2022-04-18 21:14:38
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-18 21:20:06
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\HomeWord07\One\FrenchFries.java
 * @Description: 
 * 
 */
package src.HomeWord07.One;

//  薯条有type（large, medium, small）和price属性。
public class FrenchFries {
    private String type;
    private int price;

    public FrenchFries() {
    }

    public FrenchFries(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
