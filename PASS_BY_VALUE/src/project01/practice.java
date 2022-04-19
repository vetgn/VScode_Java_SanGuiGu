package src.project01;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 问题一的值
        System.out.print("请输入n的值：");
        int n = scan.nextInt();
        // 问题一输出
        practice p1 = new practice();
        System.out.println("f(" + n + ")" + "=" + p1.one(n));


        // 问题二的值
        System.out.print("请输入m的值：");
        int m = scan.nextInt();
        // 问题二输出
        practice p2 = new practice();
        System.out.println("f(" + m + ")" + "=" + p2.two(m));


        // 问题三的值
        System.out.print("请输入i的值：");
        int i = scan.nextInt();
        // 问题二输出
        practice p3 = new practice();
        for(int j=1;j<=i;j++)
        System.out.print(p3.three(j) + " ");


        scan.close();
    }

    // 已知有一个数列：f(0) = 1 ，f(1) = 4 , f(n) = 2*f(n-1) + f(n-2),其中n是大于0的整数，求f(10)的值。
    public int one(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * one(n - 1) + one(n - 2);
        }
    }

    // 已知有一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
    // f(n)=f(n+2)-2*f(n+1)
    public int two(int m) {
        if (m == 21) {
            return 4;
        } else if (m == 20) {
            return 1;
        } else {
            return two(m + 2) - 2 * two(m + 1);
        }
    }

    /*
     * 输入一个数据n，计算斐波那契数列的第n个值
     * 1 1 2 3 5 8 13 21 34 55
     * 规律：一个数等于前两个数之和
     * 要求：计算斐波那契数列的第n个值，并将整个数列打印出来
     */
    public int three(int i) {
        if (i == 1) {
            return 1;
        } else if (i == 2) {
            return 1;
        } else {
            return three(i - 1) + three(i - 2);
        }
    }

}
