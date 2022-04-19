package src.Book2;

/**
 * 马鞍数：所在行最小，所在列最大
 */
public class five {
    public static void main(String[] args) {
        int min, max;
        int minj = 0;
        int maxi = 0;
        int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < 3; i++) {
            min = a[i][0];// 设每行最小是第一个
            for (int j = 0; j < 3; j++) {
                if (a[i][j] <= min) {
                    min = a[i][j];
                    minj = j;// 记录行中最小数的下标
                }
            }

            max = a[0][minj];
            for (i = 0; i < 3; i++) {//找到每一个行最小在其列是否最大
                if (a[i][minj] > max) {
                    max = a[i][minj];
                    maxi = i;
                }
            }
        }
        System.out.println(a[maxi][minj]);
    }
}
