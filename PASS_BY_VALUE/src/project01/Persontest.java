package src.project01;
/* 
类的结构之三：构造器（或构造方法、constructor）的使用
constructor，建设、建造。  constructor：CCB   constructor：建设者

一、构造器的作用：
1.创建对象
2.初始化参数对象

二、说明：

1.如果没有显示的定义类的构造器的话，则系统默认提供一个空参的构造器
2.定义构造器的格式：权限修饰符  类名（形参列表）{}
3.一个类中定义的多个构造器，彼此构成重载
4.一旦我们显示的定义了类的构造器之后，系统就不在提供默认的空参构造器
 */

public class Persontest {
    public static void main(String[] args) {
        // 创建类的对象：new + 构造器
        Person p1 = new Person();
        
        System.out.println(p1.getAge());
        Person p2 = new Person(21, "TOM");
        System.out.println(p2.getname()+p2.getAge());

        /*
         * Person p2 = new Person("TOM");
         * System.out.println(p2.name);;
         */

        /* p1.eat(); */
    }
}

/*
 * class Person{
 * String name;
 * int age;
 */

// 构造器
/*
 * public Person(){//系统默认提供一个空参的构造器,但我们可以写出来
 * System.out.println("Person()......");
 * }//如果我将这个注释掉，那么下面的构造器就无法使用（见说明4）
 * 
 * public Person(String n){
 * name = n;
 * }
 */
// 方法
/*
 * public void eat(){
 * System.out.println("人吃饭");
 * }
 */
// }
