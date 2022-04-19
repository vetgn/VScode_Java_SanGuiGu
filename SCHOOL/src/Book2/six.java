package src.Book2;

import java.util.Scanner;

/**
 * 设有10个猴子，数到3就退出
 * 
 */
public class six {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("请输入n的值：");
            int n = scan.nextInt();// 输入n的值
            System.out.print("请输入m的值：");
            int m = scan.nextInt();// 输入m的值
            int[] monkey = new int[n];
            int total = 0;// 记录数字，每m个就进行某些步骤
            int num = 0;// 记录已经淘汰的猴子的数量
            for (int i = 0; i < n; i++) {
                monkey[i] = 1;// 将所有猴子初始化为1
            }
            for (;;) {
                for (int i = 0; i < n; i++) {
                    // 不然，会将等于0 的猴子也算入total中
                    if (monkey[i] == 1) {
                        total++;
                    }

                    if (total == m) {
                        monkey[i] = 0;// 将已经淘汰的猴子变为0
                        total = 0;
                        num++;
                    }
                }
                if (num == n - 1) {// 当num 变成 n-1 个的时候，说明就剩一个猴子，退出循环
                    break;
                }
            }
            for (int j = 0; j < n; j++) {
                if (monkey[j] == 1) {
                    System.out.println("第" + j + "位是猴王");
                }
            }
        }
    }
}
