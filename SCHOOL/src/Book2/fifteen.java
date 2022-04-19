package src.Book2;

import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {
        int[] array = new int[6];
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("请输入6个数字:");
            for (int i = 0; i < 6; i++) {
                array[i] = scan.nextInt();
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = i; j < 6; j++) {
                System.out.print(array[j] + "\t");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(array[j] + "\t");
            }
        }
    }
}
