package src.JUNIT;
/**
 * Java中的JUnit单元测试
 * 
 * 步骤:
 * 1.打开 JAVA PROJECTS ---> Referenced Libraries添加D:\java\Junit\hamcrest-core-1.3.jar和
 * D:\java\Junit\junit-4.12.jar，就可以进行操作
 * 2.创建Java类，进行单元测试。
 *      此时的Java类要求：① 此类是public的 ②此类提供公共的无参构造器
 * 3.此类中声明单元测试方法：
 *      此时的单元测试方法：方法的权限是public，没有返回值，没有形参
 */
import org.junit.Test;

public class JunitTest {

    @Test
    public void testEquals() {
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));
    }

    @Test
    public void wc() {
        System.out.println("WCCCCCCCCCCCCCCCCCCCCCCCC");
    }
}
