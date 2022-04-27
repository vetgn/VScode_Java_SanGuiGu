/*
 * @Author: vetgn
 * @Date: 2022-04-18 21:43:52
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-18 22:06:48
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\HomeWord07\Two\Test.java
 * @Description: 
 * （4）测试类Test
 * main方法中：创建MainBoard和Screen对象；利用前两个对象，创建Phone对象。最后调用Phone对象的showMessage方法，输出所有信息。
 * 创建对象中的所需数据按需求自行编写。
 * 
 */
package src.Homeword07.Two;

public class Test {
    public static void main(String[] args) {
        MainBoard mainBoard = new MainBoard("联想", 3000.0);
        Screen screen = new Screen("惠普", 2800.0);
        Phone phone = new Phone("华为", mainBoard, screen);
        phone.showMessage();
    }
}
