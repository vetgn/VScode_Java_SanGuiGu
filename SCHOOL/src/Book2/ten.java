package src.Book2;

import java.util.Scanner;
import java.util.Arrays;

/**
 * 输入4个整数，按照从小到大的顺序输出
 */
public class ten {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] arrays = new int[4];
            System.out.print("请输入4个整数:");
            for (int i = 0; i < 4; i++) {
                arrays[i] = scan.nextInt();
            }
            Arrays.sort(arrays);
            System.out.println(Arrays.toString(arrays));
        }
    }
}
