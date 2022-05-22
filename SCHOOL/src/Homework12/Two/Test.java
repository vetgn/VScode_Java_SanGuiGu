/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:35:20
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 13:37:23
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\Two\Test.java
 * @Description: 
 * 
 */
package src.Homework12.Two;

public class Test {
    public static void main(String[] args) {
        Lion lion = new Lion(56.0, 0.6, "黄色", 38, 1.2);
        System.out.println(lion.toString());
        lion.walking();
        lion.eating("野牛");
    }
}
