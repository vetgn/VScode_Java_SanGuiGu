/*
 * @Author: vetgn
 * @Date: 2022-04-27 19:34:40
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 20:00:44
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\Person.java
 * @Description: 
 * 定义Person类，要求如下：
 * (1)私有成员变量包括身份证号码id,姓名name，年龄age和手hand;
 * (2)定义一个空构造方法，另一个构造方法初始化所有成员变量；
 * (3)定义getName()方法返回人的姓名;
 * 
 */
package src.Homework09.One;

public class Person {
    // (1)私有成员变量包括身份证号码id,姓名name，年龄age和手hand;
    private String id;// 身份证号码
    private String name;
    private int age;
    private Hand hand;
    // (2)定义一个空构造方法，另一个构造方法初始化所有成员变量；

    public Person() {
    }
    public Person(String name){
        this.name = name;
    }

    public Person(String id, String name, int age, Hand hand) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hand = hand;
    }

    /**
     * (3)定义getName()方法返回人的姓名;
     * 
     * @return
     */
    public String getName() {
        return name;
    }
    // (4)功能方法包括：
    // > (1)showPerson()方法显示某人的所有信息；
    // > (2)saying(Person per,String msg)方法表示一个人对另一个人说了一些信息msg;
    // > (3)getSomething(String something)表示用手拿东西，需要调用Hand对象的拿方法catching();
    // > (4)start(Car car)方法表示某人启动了一台汽车，需要调用Car的starting方法启动发动机。

    /**
     * (1)showPerson()方法显示某人的所有信息；
     */
    public void showPerson() {
        System.out.println("身份证号码:" + id + "\t" +
                "姓名:" + name + "\t" + "年龄:" + age + "\t" +
                hand.getInfo());
    }

    /**
     * (2)saying(Person per,String msg)方法表示一个人对另一个人说了一些信息msg;
     * 
     * @param per
     * @param msg
     */
    public void saying(Person per, String msg) {
        System.out.println(this.name + "对" + per.name + "说：" + msg);
    }

    /**
     * (3)getSomething(String something)表示用手拿东西，需要调用Hand对象的拿方法catching();
     * 
     * @param something
     */
    public void getSomething(String something) {
        System.out.println(this.name + "的手" + hand.catching(something));
    }

    /**
     * (4)start(Car car)方法表示某人启动了一台汽车，需要调用Car的starting方法启动发动机。
     * 
     * @param car
     */
    public void start(Car car) {
        System.out.println(this.name + car.starting());
    }
}
