/*
 * @Author: vetgn
 * @Date: 2022-04-24 14:23:19
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-24 14:52:39
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework08\One\Test.java
 * @Description: 
 * 定义测试类，完成如下任务：
 * (1)创建猪对象佩奇peiqi，输出peiqi的基本信息，
 * 给peiqi喂白菜吃，peiqi在行走；
 * 
 */
package src.Homework08.One;

public class Test {
    public static void main(String[] args) {
        Pig peiqi = new Pig("peiqi", 12, "雄", 4, 250, 123, 1, "粉色");
        System.out.println(peiqi);
        System.out.println(peiqi.eating("白菜"));
        peiqi.walking();
    }
}
