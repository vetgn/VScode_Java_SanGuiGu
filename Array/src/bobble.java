/*
 * @Author: vetgn
 * @Date: 2022-04-02 11:36:27
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-18 22:34:52
 * @FilePath: \vscode_Java_SanGuiGu\Array\src\bobble.java
 * @Description: 
 * 
 */
package src;

import java.util.Arrays;

public class bobble {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
        int i, j, k, max;
        for (i = 0; i < a.length - 1; i++) {
            max = i;
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    max = j;
                k = a[max];
                a[max] = a[i];
                a[i] = k;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
