package src.Book2;

import java.util.Scanner;

/**
 * 输入数字，生成正方形层数
 * 最外面一层为 2*n - 1 个数，向里则 2*n - 3 ，一直到1
 * 分析
 *    0 1 2 3 4
 * 
 * 0  1 1 1 1 1
 * 1  1 2 2 2 1
 * 2  1 2 3 2 1
 * 3  1 2 2 2 1
 * 4  1 1 1 1 1
 * 
 * 将上边的‘2’向下的方向看做是一条“竖的中间线”
 * 将左边的‘2’向右的方向看做是一条“横的中间线”
 * 
 * 可以发现，该方阵是被这两条“中间线”,给对称分开的
 * 那么，只需要，求出上面的三行就可以了
 * 求出以后
 * 可以发现，比如，就第一行来讲，有a[0][0] 与 a[0][4] 以及 a[0][1] 与 a[0][3] ，
 * 可以发现0 + 4 = 4,1 + 3 =4
 * 根据这个规律，就可以将“竖的中间线”的右边的数确定
 * 易知，“横的中间线”下方的数组也有这种规律
 */
public class sixteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入数字:");
        int num = scan.nextInt();
        int i, j;

        int[][] array = new int[2 * num - 1][2 * num - 1];
        for (i = 0; i < 2 * num - 1; i++) {// 是有多少行
            // 第一行全是 1
            if (i == 0) {
                for (j = 0; j < 2 * num - 1; j++)
                    array[i][j] = 1;
            }

            // 第二行到“横的中间线”的位置
            if (i > 0 && i < num) {
                int p = 1;//每次初始化p的值

                for (j = 0; j < 2 * num - 1; j++) {
                    while (j < i + 1 && p < i + 2) {

                        array[i][j] = p;
                        p++;
                        j++;
                    }
                    /**
                     * 每一行都有自己的特点，如 
                     * 1 1 1
                     * 1 2 2
                     * 1 2 3
                     * 那么，让“竖的中间线”的右边的数组等于“竖的中间线”上的数就可以，之后再进行覆盖就行
                     */
                    array[i][j] = array[i][j - 1];

                }
            }
        }
        // 将横向中间线的下侧的数覆盖
        for (j = 0; j < 2 * num - 1; j++) {
            for (i = 0; i <= (2 * num - 1) / 2; i++) {
                array[2 * num - 2 - i][j] = array[i][j];
            }
        }
        // 将竖向中间线的右侧的数覆盖
        for (i = 0; i < 2 * num - 1; i++) {
            for (j = 0; j <= (2 * num - 1) / 2; j++) {
                array[i][2 * num - 2 - j] = array[i][j];
            }
        }
        // 输出数列
        for (i = 0; i < 2 * num - 1; i++) {
            System.out.println();
            for (j = 0; j < 2 * num - 1; j++) {
                System.out.print(array[i][j] + "   ");
            }
        }
    }
}
