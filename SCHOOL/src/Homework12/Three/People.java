/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:40:29
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 13:49:02
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\Three\People.java
 * @Description: 
 * 
 */
package src.Homework12.Three;

public class People {
    private String name;
    private String sex;
    private int age;

    public String eating(String food) {
        return name + "正在吃：" + food;
    }

    public People(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
