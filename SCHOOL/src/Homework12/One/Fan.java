/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:04:18
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 13:11:12
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\One\Fan.java
 * @Description: 
 * 
 */
package src.Homework12.One;

public class Fan extends Equipment {
    

    public Fan(String name, double power) {
        super(name);
        this.power = power;
    }

    private double power;

    @Override
    public String toString() {
        return super.getName() + "要"+ power + "台";
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

}
