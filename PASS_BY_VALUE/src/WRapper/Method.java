/*
 * @Author: vetgn
 * @Date: 2022-05-15 19:26:23
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-15 19:46:32
 * @FilePath: \vscode_Java_SanGuiGu\PASS_BY_VALUE\src\WRapper\Method.java
 * @Description: 
 * 
 */
package src.WRapper;

import org.junit.Test;

public class Method {
    @Test
    public void test1() {
        // 基本数据类型 --> 包装类
        int a = 10;
        Integer A = new Integer(a);
        System.out.println(A.toString());
    }

    @Test
    public void test2() {
        // 包装类 --> 基本数据类型
        Integer B = new Integer("13");
        int b = B;
        System.out.println(b + 1);
    }

    @Test
    public void test3() {
        // 基本数据类型、包装类 --> String类
        int c = 10;
        String C = String.valueOf(c);
        System.out.println(C.toString());

        Integer D = new Integer("100");
        String d = String.valueOf(D);
        System.out.println(d.toString());
    }

    @Test
    public void test4() {
        // String类 --> 基本数据类型、包装类
        String E = "12";
        int e1 = Integer.parseInt(E);
        System.out.println(e1);
        Integer e2 = Integer.parseInt(E);
        System.out.println(e2.toString());
    }

    @Test
    public void test5(){
        // boolean --> 包装类
        boolean a = true;
        Boolean A = new Boolean(a);
        System.out.println(A.toString());
        // 包装类 --> boolean
        Boolean C = new Boolean(false);
        boolean c = C.booleanValue();
        // String --> boolean
        String D = "true";
        boolean d = Boolean.parseBoolean(D);
    }

}
