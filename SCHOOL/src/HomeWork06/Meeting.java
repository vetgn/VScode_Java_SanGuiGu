/*
 * @Author: vetgn
 * @Date: 2022-04-14 20:50:17
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-14 21:53:00
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\HomeWork06\Meeting.java
 * @Description: 
 * （2）测试类Meeting
创建6个班级的对象数组；利用循环语句通过Scanner对象实现控制台输入班级口号。提示：Scanner sc=new Scanner(System.in);
利用循环输出每个班级的口号，格式如下：计算机*班：***。其中：*为班级编号，***为口号。例如：计算机类1班：博学慎思，明辨笃行！
 * 
 */
package src.HomeWork06;

import java.util.Scanner;

public class Meeting {
    public static void main(String[] args) {
        String slogan;
        try (Scanner scanner = new Scanner(System.in)) {
            TCUClass[] tcuclass = new TCUClass[6];// 6个班

            for (int i = 0; i < tcuclass.length; i++) {
                tcuclass[i] = new TCUClass();// 每一个new一个对象

                tcuclass[i].setClassId(String.valueOf(i + 1));// 班级编号
                System.out.print("请输入" + (i + 1) + "班的口号:");
                // 输入班级的口号
                slogan = scanner.next();
                tcuclass[i].setSlogan(slogan);
            }
            // 输出
            for (int i = 0; i < tcuclass.length; i++) {
                System.out.println("\n计算机" + (i + 1) + "班:" + tcuclass[i].getSlogan());
            }
        }
    }
}
