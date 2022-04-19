/*
 * @Author: vetgn
 * @Date: 2022-04-02 11:36:27
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-14 20:09:49
 * @FilePath: \vscode_Java_SanGuiGu\customer_arrays\src\one.java
 * @Description: 
 * 
 */
//可以调用onetext.java中的方法
package src;

public class one {
    public static void main(String[] args) {
        
        int[] a = new int[] { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
        
        onetext o = new onetext();

        int max = o.Max(a);
        System.out.println(max);

        o.sort(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }
}
