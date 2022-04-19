package src.Book2;

import java.util.Scanner;
import java.util.Arrays;

public class four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[4];
        System.out.print("请输入4个数:");
        for (int i = 0; i < 4; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        scan.close();
    }
}
