
/**
 * 二分法
 * 
 * 1.要使用二分法，必须要数组的顺序已经排好\
 * 2. 如果输入8，范围为1~10，在5的右边，那么二分，范围变成5~10，在这里面找
 */
import java.util.Scanner;

public class dichotomy {
    public static void main(String[] args) {
        int[] arrys = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// 输入一个数字，找到其在数组的下标
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入数字1~10的数字：");
        int num = scan.nextInt();

        int i = 0;
        int j = arrys.length-1;
        for (;;) {
            if (num < arrys[(i + j) / 2]) {
                i = 0;
                j = (i + j) / 2;
            } else if (num > arrys[(i + j) / 2]) {
                i = (i + j) / 2;
                j = 2*i+1;
            } else {
                System.out.println("为数组的第" + (i + j) / 2 + "位");
                break;
            }

        }

    }
}
