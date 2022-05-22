/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:05:43
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 13:11:50
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\One\Refrigerator.java
 * @Description: 
 * 
 */
package src.Homework12.One;

public class Refrigerator extends Equipment {
    private double volume;

    public Refrigerator(String name, double volume) {
        super(name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.getName() + "要" + volume + "台";
    }
}
