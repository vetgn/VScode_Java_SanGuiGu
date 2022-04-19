package src;

import java.util.Arrays;

/* 自定义工具类 */

public class onetext {

    /**
     * 求数组的最大值
     * 
     * @param arr
     * @return
     */
    public int Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 输出数组的最小值
     * 
     * @param arr
     * @return
     */
    public int Min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return (min);
    }

    /**
     * 返回数组的总和
     * 
     * @param arr
     * @return
     */
    public int add(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum);
    }

    /**
     * 返回数组的平均值
     * 
     * @param arr
     * @return
     */
    public int aver(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum / arr.length);
    }

    /**
     * 输出反转后的数组
     * 
     * @param arr
     */
    public void reverse(int[] arr) {
        int temp;
        for (int i = 0; i <= arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("反转后的数组是" + Arrays.toString(arr));
    }

    /**
     * 复制数组
     * 
     * @param arr
     * @return
     */
    public int[] copy(int[] arr) {
        int[] arr_copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr_copy[i] = arr[i];
        }
        return (arr_copy);

    }

    /**
     * 数组排序
     * 
     * @param arr
     */
    public void sort(int[] arr) {
        int i, j, temp;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 遍历数组
     * 
     * @param arr
     */
    public void println(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 查找数组中的元素
     * 
     * @param arr
     * @param dent
     */
    public void getIndent(int[] arr, int dent) {
        for (int i = 0; i < arr.length; i++) {
            if (dent == arr[i]) {
                System.out.print("在第" + i + "个元素");
            } else
                System.out.println("该数组里没有该元素");
        }
        System.out.println();
    }
}