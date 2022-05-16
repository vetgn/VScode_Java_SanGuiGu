/*
 * @Author: vetgn
 * @Date: 2022-05-15 23:12:20
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-16 07:32:45
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework11\Three\Test.java
 * @Description: 
（3）测试类中，调用Check的drunkDriving()方法。
 * 
 */
package src.Homework11.Three;

public class Test {
    public static void main(String[] args) {
        Check check = new Check();
        try {
            check.drunkDriving(-1);
        } catch (AlcoholException e) {
            System.out.println(e.getMessage());
        }
    }
}
