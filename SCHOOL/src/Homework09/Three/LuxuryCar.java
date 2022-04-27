/*
 * @Author: vetgn
 * @Date: 2022-04-27 22:22:16
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 22:33:41
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\Three\LuxuryCar.java
 * @Description: 
 * 高配汽车LuxuryCar实现蓝牙、GPS和IOV接口
 */
package src.Homework09.Three;

public class LuxuryCar extends Car implements Bluetooth, GPS, IOV {

    public LuxuryCar() {
    }

    public LuxuryCar(String model, double speed) {
        super(model, speed);
    }

    @Override
    public void bluetooth() {
        System.out.println("LuxuryCar蓝牙");
    }

    @Override
    public void iov() {
        System.out.println("LuxuryCarIOV");
    }

    @Override
    public void gps() {
        System.out.println("LuxuryCarGPS");
    }

}
