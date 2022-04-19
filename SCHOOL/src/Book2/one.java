package src.Book2;

import java.util.Scanner;
import java.util.Arrays;

public class one {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Scanner scan = new Scanner(System.in);
        System.out.println("输入数字");
        int number = scan.nextInt();

        int i = 0;
        int j = a.length;
        int k = a.length + 1;
        int o=(i + j) / 2;
        for (;o<=j;o++) {
            if (number == a[(i + j) / 2]) {
                for (; k >= (i + j) / 2; k--) {
                    a[k] = a[k-1];
                }
                a[(i + j) / 2]=number;
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
