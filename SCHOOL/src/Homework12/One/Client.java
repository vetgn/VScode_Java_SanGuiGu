/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:09:03
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 13:21:49
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\One\Client.java
 * @Description: 
 * 
 */
package src.Homework12.One;

public class Client {
    public static void main(String[] args) {
        MyFactory myFactory = new MyFactory();
        System.out.println(myFactory.getInstance("Fan").toString());
        System.out.println(myFactory.getInstance("Refrigerator").toString());
        

    }
}
