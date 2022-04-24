/*
 * @Author: vetgn
 * @Date: 2022-04-24 14:47:59
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-24 14:50:27
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework08\Two\Test.java
 * @Description: 
 * （4）测试类（Test）：
 * main方法中：创建Book对象；并调用方法输出所有信息。
 * 创建对象中的所需数据按需求自行编写。
 */
package src.Homework08.Two;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("《活着》", "212-23", 34.89, 76.7, 768);
        book.showMessage();
    }
}
