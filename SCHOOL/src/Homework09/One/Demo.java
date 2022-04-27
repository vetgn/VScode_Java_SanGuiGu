/*
 * @Author: vetgn
 * @Date: 2022-04-27 19:51:04
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 22:46:08
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\One\Demo.java
 * @Description: 
 * 定义测试类Demo，完成如下任务：
 * (1)创建一台汽车，品牌是红旗L5，排气量是3.0，价格是25万；
 * (2)创建一只手，手指长度8厘米,手掌面积42平方厘米，握力是45kg；
 * (3)创建Person对象孙悟空和猪八戒，孙悟空向猪八戒说“八戒，你这个呆子！”，孙悟空拿了一根金箍棒并启动了一辆红旗L5汽车。
 * 
 */
package src.Homework09.One;

public class Demo {
    public static void main(String[] args) {
        // (1)创建一台汽车，品牌是红旗L5，排气量是3.0，价格是25万；
        Car car = new Car("红旗L5", 3.0, "25万");
        System.out.println(car.getBrand());

        // (2)创建一只手，手指长度8厘米,手掌面积42平方厘米，握力是45kg；
        Hand hand = new Hand("8厘米", "42平方厘米", "握力是45kg");
        System.out.println(hand.getInfo());

        // (3)创建Person对象孙悟空和猪八戒，孙悟空向猪八戒说“八戒，你这个呆子！”，孙悟空拿了一根金箍棒并启动了一辆红旗L5汽车。
        Person SunWuKong = new Person("123", "孙悟空", 1234, hand);
        Person ZhuBajie = new Person("猪八戒");

        SunWuKong.saying(ZhuBajie, "八戒，你这个呆子！");
        SunWuKong.getSomething("一根金箍棒");
        SunWuKong.start(car);
    }
}
