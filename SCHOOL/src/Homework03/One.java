package src.Homework03;

/**
 * 1.在控制台输入一组数字，排序后在控制台输出
 */
import java.util.Arrays;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] array = new int[5];
            System.out.println("请输入5个数字，用空格分开：");
            for (int i = 0; i < 5; i++) {
                array[i] = scan.nextInt();// 输入数字
            }

            One.sort(array);// 进行排序
            System.out.println(Arrays.toString(array));// 输出数组
        }
    }

    /**
     * 将数组进行排序
     * 
     * @param array
     */
    public static void sort(int[] array) {
        int t;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }
}
