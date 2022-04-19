import java.util.Arrays;

public class selsect {
    public static void main(String[] args) {
        int i, j, k;
        int[] a = new int[] { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (a[j] > a[j + 1]) {
                    k = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = k;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
