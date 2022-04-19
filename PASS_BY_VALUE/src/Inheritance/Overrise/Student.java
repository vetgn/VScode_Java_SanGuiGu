package src.Inheritance.Overrise;

/**
 * 方法的重写(override/overwrite)
 * 
 * 1.重写：子类继承父类以后，可以对父类中同名参数的方法，进行覆盖操作（不会对属性进行覆盖）
 * 
 * 2.应用：重写以后，当创建子类对象以后，通过子类对象调用子父类中的同名同参数的方法时，实际执行的是子类重写
 * 父类的方法
 * 
 * 3.重写的规定：
 * 方法的声明：权限修饰符 返回值类型 方法名(形参列表){
 * //方法体
 * }
 * 约定俗称：子类中的叫重写的方法，父类中的叫被重写的方法
 * ①.子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同(即声明的public等子类要么与父类相同，要么权限比父类的大)
 * ②.子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符
 * >特殊情况：子类不能重写父类中声明为private权限的方法
 * ③.返回值类型：
 * >父类被重写的方法的返回值类型是void,则子类重写的方法的返回值类型只能是void
 * >父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A类的子类
 * >父类被重写的方法的返回值类型是基本数据类型(比如：double),则子类重写的方法的返回值类型必须是相同的基本数据类型(double)
 * >子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型(具体放到异常处理的时候讲)
 * ****************************************************************************************************
 * 子类和父类的同名同参数的方法要么都声明为非static的(考虑重写),要么都声明为static(可以重写)的.
 */

public class Student extends Person {
    public static void main(String[] args) {
        Student student = new Student();
        Person p = new Person();
        student.eat();
        System.out.println("*************");
        p.walk();
    }

    public void eat() {
        System.out.println("学生吃饭");// 将Person中的eat函数给覆盖了
        System.out.println(info01());

    }

    public void info() {
        System.out.println("我是一个学生");//
    }

    public String info01() {// 这就是"A的子类的介绍"
        return "学生";
    }
}
