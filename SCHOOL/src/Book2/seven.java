package src.Book2;

import java.util.Arrays;

/**
 * 将数组中最小的数与第一个数交换、最大的数与最后的数进行交换
 */
public class seven {
    public static void main(String[] args) {
        int[] arrys = new int[] { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int max, min, t;
        int mini = 0;
        int maxj = 0;
        max = arrys[0];
        min = arrys[0];
        for (int i = 0; i < arrys.length; i++) {
            if (arrys[i] < min) {
                mini = i;
                min=arrys[mini];
            }
        }
        t = arrys[mini];
        arrys[mini] = arrys[0];
        arrys[0] = t;

        for (int j = 0; j < arrys.length; j++) {
            if (arrys[j] >= max) {
                maxj = j;
                max = arrys[maxj];
            }
        }
        t = arrys[maxj];
        arrys[maxj] = arrys[arrys.length-1];
        arrys[arrys.length-1] = t;

        System.out.println(Arrays.toString(arrys));
        /*
         * for(int i=0;i<10;i++){
         * System.out.print(arrys[i]);
         * }
         */
    }
}
