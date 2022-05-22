/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:50:11
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 13:56:30
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\Three\Test.java
 * @Description: 
 * 
 */
package src.Homework12.Three;

public class Test {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("张仲景", "男", 56, true, "东汉南阳涅阳县");
        System.out.println(doctor.toString());
        System.out.println(doctor.eating("白开水"));
        System.out.println(doctor.recreation());
        System.out.println(doctor.working());
    }
}
