/*
 * @Author: vetgn
 * @Date: 2022-04-19 11:48:50
 * @LastEditors: vetgn
 * @LastEditTime: 2022-06-03 19:33:17
 * @FilePath: \vscode_Java_SanGuiGu\PASS_BY_VALUE\src\Below\Block\LeafTest.java
 * @Description: 
 * 
 */
package src.Below.Block;

//代码块的执行要先于方法、构造器
//总结：由父及子，静态先行
class Root {
    static {
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }

    public Root() {
        System.out.println("Root的无参数的构造器");
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }

    public Mid() {
        System.out.println("Mid的无参数的构造器");
    }

    public Mid(String msg) {
        // 通过this调用同一类中重载的构造器
        this();
        System.out.println("Mid的带参数构造器，其参数值：" + msg);
    }
}

class Leaf extends Mid {
    static {
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf() {
        // 通过super调用父类中有一个字符串参数的构造器
        super("ZJJ");
        System.out.println("Leaf的构造器");
    }
}

public class LeafTest {
    public static void main(String[] args) {
        new Leaf();

        new Leaf();// 静态就不会执行
    }
}
