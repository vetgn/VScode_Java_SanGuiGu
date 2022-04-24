/*
 * @Author: vetgn
 * @Date: 2022-04-24 14:15:02
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-24 14:47:33
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework08\One\Pig.java
 * @Description: 
 * 
 */
package src.Homework08.One;

public class Pig extends Animal {
    // (1)成员变量有长度length，高度height和颜色color
    protected int length;
    protected int height;
    protected String color;

    // (2)定义构造方法能够初始化所有成员变量
    public Pig(String name, int age, String sex, int legNum, double weight, int length, int height, String color) {
        super(name, age, sex, legNum, weight);
        this.length = length;
        this.height = height;
        this.color = color;
    }
    // (3)省略setter和getter方法

    /**
     * 重写toString()方法返回Pig对象的所有成员变量
     */
    @Override
    public String toString() {
        return "Pig:" + super.toString() + "\nlength:" + length +
                "\nheight:" + height + "\ncolor:" + color;
    }

    /**
     * 重写eating(String food)方法，food只能是Pig可以吃的食物
     */
    @Override
    protected String eating(String food) {
        return "Pig吃:" + super.eating(food);
    }

    /**
     * 定义成员方法walking()表示Pig可以行走
     */
    public void walking() {
        System.out.println("Pig可以行走");
    }
}
