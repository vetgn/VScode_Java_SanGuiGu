package src.WRapper;

import org.junit.Test;

/**
 * 包装类的使用：
 * 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 * 
 * 2.掌握的：基本数据类型、包装类、String三者之间的相互转换
 */
public class WrapperTest {

    @Test
    public void test3() {
        // 自动装箱，基本数据类型--->包装类
        int num2 = 10;
        Integer in1 = num2;// 自动装箱

        boolean b1 = true;
        Boolean b2 = b1;// 自动装箱
        System.out.println(b2);
        
        // 自动装箱：包装类--->基本数据类型
        System.out.println(in1.toString());

        int num3 = in1;// 自动拆箱
        System.out.println(num3);
    }

    /**
     * 基本数据类型-->包装类：调用包装类的构造器
     */
    @Test
    public void test1() {
        int num1 = 10;
        // System.out.println(num1.toString());不行
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString()+14);

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        Float f1 = new Float("123.3");
        System.out.println(f1.toString());
        Float f2 = new Float(12.3);
        System.out.println(f2.toString());

        Boolean b1 = new Boolean(true);// true
        System.out.println(b1);

        Boolean b2 = new Boolean("true");// true
        System.out.println(b2);

        Boolean b3 = new Boolean("TrUe");// true
        System.out.println(b3);

        Boolean b4 = new Boolean("true123");// false
        System.out.println(b4);

        Ordle ordle = new Ordle();
        System.out.println(ordle.man);// 默认false
        System.out.println(ordle.woman);// null
    }

    // 包装类--->基本数据类型：调用包装类的×××Value()
    @Test
    public void test2() {
        Integer in1 = new Integer(12);

        int i1 = in1.intValue();
        System.out.println(i1 + 1);// 13

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);// 13.3
    }

    // 基本数据类型、包装类--->String类型：调用String重载的valueOf(××××)
    @Test
    public void test4() {
        int num1 = 10;
        // 方式1：连接运算
        String str1 = num1 + "";
        System.out.println(str1);// "10"

        // 方式2：调用String的valueOf(××××)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);// "12.3"
        System.out.println(str2);

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str3);// "12.4"
    }

    // String类型--->基本数据类型、包装类：调用包装类的parse×××(String s)
    @Test
    public void test5() {
        String str1 = "123";

        int num1 = Integer.parseInt(str1);
        System.out.println(num1 + 1);// 124

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);// true
    }

}

class Ordle {
    boolean man;
    Boolean woman;
}
