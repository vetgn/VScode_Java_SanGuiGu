package src.Homework03;

import java.util.Arrays;

/**
 * 写一个方法，实现功能：定义一个int型的一维数组，返回该数组的后len个数据。
 * 定义如下方法：public static int[] LenArr(int[] Arr,int len) 。
 * 在main方法中调用这个方法，实现返回Arr数组中，后len个数据。
 * 比如，main方法中定义int[] arr= {1,2,3,4,5,6,7,8,9,10};
 * 调用方法LenArr（arr,4），得到一个新的数组，显示为{7,8,9,10}。
 */
public class Three {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] brr = new int[10];//用brr数组来接收
        brr = Three.LenArr(arr, 4);
        System.out.println(Arrays.toString(brr));
    }

    /**
     * 将arr数组后len位赋给brr数组
     * 
     * @param Arr
     * @param len
     * @return
     */
    public static int[] LenArr(int[] Arr, int len) {
        int[] brr = new int[len];
        int j = 0;
        for (int i = 10 - len; i < Arr.length; i++, j++) {
            brr[j] = Arr[i];
        }
        return brr;
    }
}
