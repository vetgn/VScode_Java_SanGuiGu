package src.Below.Block;

/**
 * 类的成员之四：代码块（或初始化块）
 * 
 * 1.代码块的作用：用来初始化类、对象
 * 2.代码块如果有修饰的话，只能使用static
 * 3.分类：静态代码块 VS 非静态代码块
 * 
 * 4.静态代码块
 * >内部可以有输出语句
 * >随着类的加载而执行，而且只执行一次
 * >作用：初始化类的信息
 * >如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * >静态代码块的执行要优先于非静态代码块的执行
 * >静态代码块內只能调用静态的属性、静态的方法、不能调用非静态的结构
 * 
 * 5.非静态代码块
 * >内部可以有输出语句
 * >随着对象的创建而调用
 * >没创建一个对象，就执行一次非静态代码块
 * >作用：可以在创建对象时，对对象的属性等进行初始化
 * >如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 * >非静态代码块內可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);
        Person p1 = new Person();
        new Person();
        Person.info();
        System.out.println(p1.age);
    }
}

class Person {

    // 属性
    String name;
    int age;
    static String desc = "我是一个人";
    // 构造器

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 非static的代码块，即使将非static的代码块放在最上面，也是先执行static的代码块
    {
        System.out.println("hello,block");
        age = 1;
        age++;
    }
    // static的代码块
    static {
        desc = "我是一个爱学习的人";
        System.out.println("hello,static block-2");
    }

    static {
        desc = "我是一个爱学习的人";
        System.out.println("hello,static block-1");
    }

    // 方法
    public void eat() {
        System.out.println("吃法");
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

    public static void info() {
        System.out.println("我是一个快乐的人");
    }

}
