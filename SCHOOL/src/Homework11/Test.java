/*
 * @Author: vetgn
 * @Date: 2022-05-15 23:05:24
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-16 07:33:44
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework11\Test.java
 * @Description: 
 * 2. 编写一个程序，从键盘读入一个实数，除以0，然后检查这个异常，抛出异常，练习try-catch-finally的运行过程
 * 
 */
package src.Homework11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("请输入一个实数：");
            int a = scanner.nextInt();
            try {
                int b = a / 0;
                System.out.println(b);
            } catch (ArithmeticException e) {
                System.out.println("除了一个0！");
            }finally{
                System.out.println("请不要除0");
            }
        }

    }
}
