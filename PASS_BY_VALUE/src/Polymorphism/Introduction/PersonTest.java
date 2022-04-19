package src.Polymorphism.Introduction;

/**
 * 面向对象特征之三：多态性
 * 
 * 1.理解多态性：可以理解为一个事物的多种形态
 * 2.何为多态性：
 * 对象的多态性：父类的引用指向子类的对象(或子类的对象赋给父类的引用)
 * 
 * 3.多态性的使用：虚拟方法调用
 * 有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
 * 总结：编译，看左边；运行，看右边
 * 
 * 4.多态性的适用前提：① 类的继承关系 ② 方法的重写
 * 
 * 5.对象的多态性，只适用于方法，不适用于属性
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.add();
        man.eat();
        man.age = 25;
        man.earnMoney();
        // *****************************************
        System.out.println("*********************");
        Person p2 = new Man();
        // 多态的使用，当调用父类同名同参数的方法时，实际执行的是子类重写父类的方法----虚拟方法调用
        p2.eat();
        p2.walk();
        // p2.earnMoney(); 因为调用的是父类里的方法，而父类没有earnMoney()方法，因此无法调用!
        System.out.println(p2.id);// 1001
        System.out.println("************************");

        // 不能调用子类所持有的方法、属性
        // 有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，
        // 导致编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。

        // 如何才能调用子类特有的属性和方法?
        // 向下转型：使用强制类型转换符。
        Man m1 = (Man) p2;
        m1.earnMoney();
        m1.isSmoking = true;

        // 使用强转时，可能出现ClassCastException的异常。
        // Woman w1 = (Woman)p2;
        // w1.goshopping();
        System.out.println("************************");        System.out.println("************************");


        /**
         * instanceof关键字的使用
         * 
         * a instanceof A ：判断对象a是否类A的实例。如果是，返回true；如果不是，返回false。
         * 
         * 使用情景：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行
         * instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。
         * 
         * 如果 a instanceof A返回true，则 a instanceof B也返回true。
         * 其中，类B是类A的父类。
         * 
         */
        if (p2 instanceof Woman) {
            Woman w1 = (Woman) p2;
            w1.goshopping();
            System.out.println("Woman");
            System.out.println("************************");

        }

        if (p2 instanceof Man) {
            Man w1 = (Man) p2;
            w1.earnMoney();
            ;
            System.out.println("Man");
            System.out.println("************************");

        }

        if (p2 instanceof Person) {
            Person w1 = (Person) p2;
            w1.eat();
            System.out.println("Person");
            System.out.println("************************");

        }
    }
}
