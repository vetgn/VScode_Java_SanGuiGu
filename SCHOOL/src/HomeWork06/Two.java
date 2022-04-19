/*
 * @Author: vetgn
 * @Date: 2022-04-14 21:26:11
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-14 21:29:27
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\HomeWork06\Two.java
 * @Description: 
 * 
 */
package src.HomeWork06;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        One[] one = new One[3];

        Scanner scanner = new Scanner(System.in);

        String n = null;
        
        for (int i = 0; i < one.length; i++) {
            n = scanner.next();
            //one[i] = new One();
            one[i].name = n;
        }

        for (int j = 0; j < one.length; j++) {
            System.out.print(one[j].name);
        }
    }
}

class One {
    String name;
}
