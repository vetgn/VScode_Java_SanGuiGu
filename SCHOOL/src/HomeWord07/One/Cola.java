/*
 * @Author: vetgn
 * @Date: 2022-04-18 21:14:14
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-18 21:19:30
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\HomeWord07\One\Cola.java
 * @Description: 
 * 
 */
package src.Homeword07.One;

public class Cola {
    // 可乐有volume(容量);price属性；
    private int volume;// 容量
    private int price;

    public Cola() {
    }

    public Cola(int volume, int price) {
        this.volume = volume;
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
