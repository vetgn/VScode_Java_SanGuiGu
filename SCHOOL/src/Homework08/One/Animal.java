/*
 * @Author: vetgn
 * @Date: 2022-04-24 14:01:05
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-24 14:35:49
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework08\Animal.java
 * @Description: 
 * 1. 设计动物类Animal，要求如下：
 * (1)protected的成员变量包括名称name、年龄age、性别sex、腿的数量legNum、体重weight；
 * (2)定义空构造方法，定义能够初始化所有成员变量的构造方法；
 * (3)省略setter和getter方法；
 * (4)功能方法包括：protected方法eating(String food)；重写Object类的toString()方法返回Animal对象的所有成员变量。
 */
package src.Homework08.One;

public class Animal {
    // (1)protected的成员变量包括名称name、年龄age、性别sex、腿的数量legNum、体重weight
    protected String name;
    protected int age;
    protected String sex;
    protected int legNum;
    protected double weight;

    // (2)定义空构造方法，定义能够初始化所有成员变量的构造方法；
    public Animal(String name, int age, String sex, int legNum, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.legNum = legNum;
        this.weight = weight;
    }

    // (3)省略setter和getter方法
    // (4)功能方法包括：

    /**
     * 重写Object类的toString()方法返回Animal对象的所有成员变量
     */
    @Override
    public String toString() {
        return "\nname:" + name + "\nage:" + age + "\nsex:" + sex + "\nlegNum" + legNum + "\nweight:" + weight;
    }

    /**
     * protected方法eating(String food)
     * 
     * @param food
     */
    protected String eating(String food) {
        return food;
    }

}
