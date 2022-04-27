/*
 * @Author: vetgn
 * @Date: 2022-04-27 22:22:07
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 22:32:28
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\Three\MiddleCar.java
 * @Description: 
 * 中配汽车MiddleCar实现蓝牙接口
 */
package src.Homework09.Three;

public class MiddleCar extends Car implements Bluetooth{

    public MiddleCar() {
    }

    public MiddleCar(String model, double speed) {
        super(model, speed);
    }

    @Override
    public void bluetooth() {
        System.out.println("MiddleCar蓝牙");
    }
    
}
