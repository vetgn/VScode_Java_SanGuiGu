package src.Inheritance.Introduction;

/**
 * 面向对象的特征之一：继承性
 * 
 * 一、继承性的好处：
 * 1.减少了代码的冗余，提高了代码的复用性
 * 2、便于功能的扩展
 * 3.为以后多态性的使用，提供了前提
 * 
 * 二、继承性的格式：class A extend B{}
 * A:子类、派生类、subclass
 * B:父类、超类、基类、superclass
 * 
 * 1.体现：一旦子类继承父类B以后，子类A中就获取了父类B中声明的结构、属性、方法
 * 特别的，父类中声明为private的属性或方法，子类继承父类以后，仍然认为获取了父类私有的结构。
 * 只有因为封装性的影响，使得子类不能直接调用父类的结构而已。
 * 2.子类继承父类以后，还可以声明自己特有的属性或方法，实现功能的扩展
 * 子类和父类的关系不同于子集和集合的关系
 * 
 * 三、Java中关于继承性的规定:
 *      1.一个类可以被多个子类继承。
 *      2.Java中类的单继承性:一个类只能有一个父类
 *      3.子父类是相对的概念
 *      4.子类直接继承父类，称为:直接父类。间接继承的父类称为：间接父类
 *      5.子类继承父类以后，就获取了直接父类以及所有间接父类中声明的属性和方法
 * 
 * 四、1.如果我们没有显式的声明一个类的父的话，则继承与java.lang.Oject类
 *     2.所有的java类（除java.lang.Object类之外）都直接或间接的继承与java.lang.Object类
 *     3.意味着，所有的java类具有java.lang.Object类声明的功能。
 */

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.eat();
        customer.sleep();
        customer.age = 10;
        System.out.println("age=" + customer.age);//age没有加private，可以直接进行调用

        System.out.println("*************");
        Student student = new Student();
        student.eat();
        student.sleep();
        //student.gender = '男';  //这样是无法进行直接的调用
        student.setGender('男');
        System.out.println("性别为 " + student.getGender());
        //由最终的结果可得，即使加了private仍然可以进行继承，但是具有封装性，要运用到get,set

        //三
        student.toilet();
    }
}
