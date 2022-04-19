package src.Below.Abstract;

/**
 * abstract关键字的使用
 * 1.abstract：抽象的
 * 2.abstract可以用来修饰的结构：类、方法
 * 
 * 3.abstract修饰类：抽象类
 * > 此类不能实例化
 * > 抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
 * > 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 * 
 * 4.abstract修饰方法：抽象方法
 * > 抽象方法只有方法的声明，没有方法体
 * > 包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
 * > 若子类重写父类中的所有抽象方法后，此子类方可实例化
 * 若子类没有重写父类中的所有抽象方法后，此子类也是一个抽象类，需要使用abstract修饰
 * 
 * 5.abstract使用上的注意点：
 * > abstract 不能用来修饰：属性、构造器等结构
 * > abstract 不能用来修饰私有方法、静态方法、final的方法、final的类
 * 
 * 6.那么在什么情况下去进行使用？
 * > 比如在之前有一个题目，求各种图形的面积，而父类只提供了方法，但并没有提供详细的方法体，因为不知道图形的形状，只能在子类中进行重写
 * 那么，我们就可以将这个父类定义为abstract，并且将方法也定义为abstract，交给子类去重写
 */
public class AbstractTest {
    public static void main(String[] args) {
        // 一旦Person类抽象了，就不能实例化
        // Person p1 = new Person();
        // p1.eat();
    }
}

abstract class Creature{
    public abstract void breath();
}

abstract class Person extends Creature{
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 抽象方法
    public abstract void eat();

    public void walk() {
        System.out.println("人走路");
    }
}

abstract class Student extends Person {

    // 子类仍然可以进行调用
    public Student(String name, int age) {
        super(name, age);
    }

    // 可以对抽象的方法进行重写 或者 将子类加上abstract来修饰
    // public void eat() {
    // System.out.println("学生吃有营养的食物");
    // }
    //对breath也要进行重写，因为它是间接继承的
    // public void breath(){

    // }
}
