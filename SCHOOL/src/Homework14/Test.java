package src.Homework14;

/*
 * @Author: vetgn
 * @Date: 2022-06-09 08:54:52
 * @LastEditors: vetgn
 * @LastEditTime: 2022-06-09 08:58:35
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework14\Test.java
 * @Description: 
 * 
 */
public class Test {
    public static void main(String[] args) {
        VisualWorldUSB visualWorldUSB = new VisualWorldUSB();
        visualWorldUSB.readDate();
        visualWorldUSB.mousePressed();
        visualWorldUSB.mouseReleased();
    }
}
