package src.experment;

/**
 * this关键字的使用：
 * 1.this可以用来修饰：属性、方法、构造器
 * 
 * 2.this修饰属性和方法：
 * this理解为：当前对象或当前正在创建的对象
 * 
 * 在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象属性或方法。但是
 * 通常情况下，我们都选择省略"this."。特殊情况下，如果方法的形参和类的属性同名时，我们必须
 * 显示的使用"this.变量"的方式，表明此变量是属性，而非形参。
 * 
 * 3.this调用构造器
 * （1）我们在类的构造器中，可以显式的使用"this(形参列表)"方式，调用本类中指定的其他构造器
 * （2）构造器中不能通过"this(形参列表)"方式调用自己
 * （3）如果一个类中有n个构造器，则最多有n - 1构造器中使用了this(行参列表)""
 * （4）规定："this(行参列表)"必须声明在当前构造器的首行
 * （5）构造器内部，最多只能声明一个"this(形参列表)"，用来调用其他的构造器
 */
public class two {
    public static void main(String[] args) {
        Person t = new Person();
        /*
         * t.set_age(12);
         * System.out.println(t.get_age());
         */
       /*  t.name_age("tom", 12); */
    }

}
 class Person {
    private String name;
    private int age;

    public Person() {
        this.eat();
        System.out.println("***********************");
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_name() {
        return name;
    }

    public void set_age(int age) {
        this.age = age;
    }

    public int get_age() {
        this.sleep();
        return age;
    }

    public void name_age(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this.name + this.age);
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        this.name_age("TOM", 12);
        System.out.println("人睡觉");
    }

}