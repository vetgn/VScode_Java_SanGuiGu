package src.Below.Final;

/**
 * final:最终的
 * 
 * 1.fianl可以用来修饰的结构：类、方法、变量
 * 
 * 2.final 用来修饰一个类：此类不能被其他类所继承。
 * 比如：String类、System类、StringBuffer类
 * 
 * 3.final 用来修饰方法：表明此方法不可以被重写
 * 比如：Object类中getClass();
 * 
 * 4.final 用来修饰变量：此时的"变量"就称为是一个常量
 * 4.1 final 修饰属性：可以考虑赋值的位置有：显式初始化、代码块中初始化、构造器中初始化
 * 4.2 final 修饰局部变量：
 * 尤其是使用final修饰形参时，表明此形参时一个常量。当我们调用此方法时，给形参赋一个实参。一旦赋值以后
 * ，就只能在方法体内使用此形参，但不能进行重新赋值
 * 
 * static fianl :用来修饰全局常量
 */
public class FinalTest {

}

// 修饰类
final class One {

}
/*
 * 会报错
 * class Two extends One{
 * 
 * }
 */

// ************************************************************* */

// 修饰方法
class AA {
    public final void aa() {

    }
}

/*
 * 会报错
 * class BB extends AA{
 * public void aa(){
 * 
 * }
 * }
 */

// ************************************************************* */

// 修饰变量

class CC {
    final int f = 10;

    /*
     * 用final修饰以后，变成常量，无法进行修改
     * public void add(){
     * f = 20;
     * }
     */
}

// 4.
class DD {
    // 不能final int a;
    // 4.2
    public void four(final int num) {
        // num = 20;无法对其进行修改
        System.out.println(num);
    }

    public static void main(String[] args) {
        DD dd = new DD();
        dd.four(10);
    }

}
