/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:07:37
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 13:23:05
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\One\MyFactory.java
 * @Description: 
 * 
 */
package src.Homework12.One;

import java.util.Scanner;

public class MyFactory {
    public Equipment getInstance(String equipmentName) {
        Scanner scanner = new Scanner(System.in);
        if (equipmentName.equals("Fan")) {
            System.out.print("Fan需要多少台？：");
            double power = scanner.nextDouble();
            return new Fan("Fan", power);
        } else if (equipmentName.equals("Refrigerator")) {
            System.out.print("Refrigerator需要多少台？：");
            double volume = scanner.nextDouble();
            return new Refrigerator("Refrigerator", volume);
        }

        return null;
    }
}
