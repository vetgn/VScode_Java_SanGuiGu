/*
 * @Author: vetgn
 * @Date: 2022-04-27 22:01:12
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 22:35:49
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\Three\Car.java
 * @Description: 
 * 小汽车工厂按照模块化方式生产汽车，低配汽车仅仅具有基本功能，舒适度低，中配汽车在低配基础上提供了满足部分个性化需求的功能，例如蓝牙等，而高配在中配的基础上增加了GPS定位和车联网等功能。
 * 定义小汽车类Car，要求如下：
 * (1)成员变量包括型号，速度；
 * (2)定义一个空构造方法，一个能够初始化所有成员变量的构造方法；
 * (3)必要的setter和getter方法；
 * (4)功能方法包括：重写toString()方法返回有意义的汽车信息。
 * 
 * 定义如下接口：
 * (1)蓝牙接口Bluetooth具有启动关闭蓝牙功能;
 * (2) GPS接口提供GPS定位功能;
 * (3)车联网IOV接口提供车联网功能。
 * 
 * 定义中配汽车MiddleCar实现蓝牙接口，高配汽车LuxuryCar实现蓝牙、GPS和IOV接口。
 * 
 * 定义测试类，完成如下：
 * (1)创建低配汽车对象，并输出该汽车的基本信息；
 * (2)创建中配汽车对象，输出基本信息，并调用蓝牙功能；
 * (3)创建高配汽车对象，利用GPS进行定位，建立与其它汽车的的IOV连接。
 */
package src.Homework09.Three;

public class Car {
    // (1)成员变量包括型号，速度；
    private String model;// 型号
    private double speed;// 速度

    // (2)定义一个空构造方法，一个能够初始化所有成员变量的构造方法；

    public Car() {
    }

    public Car(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }
    // (3)必要的setter和getter方法；

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * (4)功能方法包括：重写toString()方法返回有意义的汽车信息。
     */
    @Override
    public String toString() {
        return "model:" + model + "\t" + "speed:" + speed;
    }
}
