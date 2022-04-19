package src.Below.Static;

/**
 * static关键字的使用
 * 
 * 1.static：静态的
 * 2.static可以用来修饰：属性、方法、代码块、内部类
 * 
 * 3.使用static修饰属性：静态变量(或类变量)
 *      3.1 属性，按是否使用static修饰，又分成：静态属性 VS 非静态属性(实例变量)
 *       实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。
 *       当修改其中一个对象中的非静态属性时，不会导致其他对象中同样的属性值的修改。
 *       静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量。当通过某一个对象
 *       修改静态变量时，会导致其他对象调用此静态变量时，是修改过了的。
 *      3.2 static修饰属性的其他说明：
 *          ① 静态变量随着类的加载而加载。可以通过"类.静态变量"的方式进行调用
 *          ② 静态变量的加载要早于对象的创建。
 *          ③ 由于类只会加载一次，则静态变量在内存中也只会存在一份：存在方法区的静态域中
 * 
 *          ④           类变量          实例变量
 *          类          yes             no
 *          对象        yes             yes
 * 
 * (类变量，是归属类的变量，它是通过在定义类的属性的时，增加static修饰符，所以又称为静态变量。
 * 实例变量，是归属于类的实例的变量，又称为成员变量，没有经过static修饰。)
 * 
 * 4.使用static修饰方法：静态方法
 *      ① 随着类的加载，可以通过"类.静态方法"的方式进行调用
 *      ②          静态方法         非静态方法
 *      类          yes             no
 *      对象        yes             yes
 *      ③ 静态方法中，只能调用静态的方法或属性
 *        非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
 * 
 * 5.static注意点：
 *      ①在静态的方法內，不能使用this关键字、super关键字
 *      ②所有的静态前面省略的都是类名
 * 
 * 6.开发中，如何确定一个属性是否要声明为static的？
 *      >属性是可以被多个对象共享的，不会随着对象的不同而不同
 *      >属性中共用的属性一半声明为static
 * 
 *   开发中，如何确定一个方法是否要声明为static的？
 *      >操作静态属性的方法，通常设置为static的
 *      >工具类中的方法，习惯上声明为static的。比如：Math、Arrays、Collections
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese.nation = "CHN";
        System.out.println(Chinese.nation);//类.静态变量

        Chinese c1 = new Chinese();
        c1.age = 10;
        c1.name = "小明";
        //c1.nation = "MC";
        System.out.println("c1的" + c1.age + "\t" + c1.name + "\t" + Chinese.nation);

        Chinese c2 = new Chinese();
        c2.age = 20;
        c2.name = "小红";
        //c2.nation = "MB";
        System.out.println("c2的" + c2.age + "\t" + c2.name + "\t" + Chinese.nation);

        //Chinese.name = "小王";这是无法调用的
        System.out.println("*********方法**********");
        Chinese.show();
    }

}

class Chinese{
    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("人会吃饭");
        walk();
        System.out.println(nation);// 省略了Chinese.
    }

    public static void show(){
        System.out.println("我是中国人");
        //非静态无法调用
        //eat();
        //name = "TOM";
        //静态可以调用
        System.out.println(nation);//完整的为Chinese.nation
        walk();
    }

    public static void walk(){

    }
}
