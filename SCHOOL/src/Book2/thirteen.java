package src.Book2;

/**
 * 求1000以内的所有完数，如：1+2+3=6
 */
public class thirteen {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                    if (sum == i) {
                        num++;
                        System.out.print(i + "\t");
                        break;
                    }
                }
            }
            if (num % 5 == 0) {
                System.out.println();
            }
        }
    }
}
