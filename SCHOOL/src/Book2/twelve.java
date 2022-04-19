package src.Book2;

import java.util.Scanner;

/**
 * 求出两个数的最大公约数和最小公倍数
 */
public class twelve {
    public static void main(String[] args) {
        int i;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("请输入两个数字:");
            int m = scan.nextInt();
            int n = scan.nextInt();
            m = (m < n) ? n : m;
            for  (i = m-1; i > 1; i--) {
                if (m % i == 0 && n % i == 0) {
                    System.out.println("最大公约数为" + i);
                    break;
                }
            }
            int num =(m/i)*(n/i)*i;
            System.out.println("最小公倍数为" + num);
        }
    }
}
