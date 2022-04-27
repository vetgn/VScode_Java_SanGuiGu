/*
 * @Author: vetgn
 * @Date: 2022-04-27 20:18:37
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 21:28:37
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\Two\Person.java
 * @Description: 
 * 定义抽象类Person，要求如下：
 * (1)成员变量包括身份证号id，姓名name,性别sex，出生日期birthday，国籍nationality是public static成员变量；
 * (2)构造方法包括一个空构造方法，一个能够初始化所有成员变量的构造方法；
 * (3)省略setter和getter方法；
 * (4)功能方法包括：
 * > 实体方法saying(Person  per, String msg)表示向per对象说了一句话，
 * > 重写Object中的toString()方法返回Person对象有意义的信息，
 * > 抽象方法working(String information)表示某人在工作。
 * 
 */
package src.Homework09.Two;

public abstract class Person {
    // (1)成员变量包括身份证号id，姓名name,性别sex，出生日期birthday，国籍nationality是public static成员变量；
    private String id;// 身份证号
    private String name;
    private String sex;
    private String birthday;
    public static String nationality = "中国";// 国籍
    // (2)构造方法包括一个空构造方法，一个能够初始化所有成员变量的构造方法；

    public Person() {
    }

    public Person(String id, String name, String sex, String birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    // (3)省略setter和getter方法；
    public String getName() {
        return name;
    }
    // (4)功能方法包括：

    /**
     * 实体方法saying(Person per, String msg)表示向per对象说了一句话，
     * 
     * @param per
     * @param msg
     */
    public void saying(Person per, String msg) {
        System.out.println(this.name + "和" + per.name + "说" + msg);
    }

    /**
     * 重写Object中的toString()方法返回Person对象有意义的信息，
     */
    @Override
    public String toString() {
        return "id:" + id + "\t" + "name:" + name + "\t"
                + "sex:" + sex + "\n" + "birthday:" + birthday + "\t" +
                "nationality:" + nationality + "\t";
    }

    /**
     * 抽象方法working(String information)表示某人在工作
     * 
     * @param information
     */
    public abstract void working(String information);
}
