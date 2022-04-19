package src.Homework02;

public class three {
    public static void main(String[] args) {
        double sum = 0.0;
        int aInt = (int) (0 + Math.random() * (100 - 0 + 1));

        // (1)
        for (;;) {
            if (aInt >= 50 && aInt <= 60) {
                aInt = (int) (0 + Math.random() * (100 - 0 + 1));
            } else
                break;
        }

        // (2)
        if (aInt % 7 == 0) {
            System.out.println("被7整除");
        }
        // (3)
        if (aInt / 2 != 0) {
            for (double j = 1; j <= aInt; j++) {
                sum = sum + (double) (1 / j);
            }
            System.out.println("奇数和为" + sum);
        }

        // (4)
        if (aInt % 2 == 0) {
            for (int i = 1; i < aInt; i++) {
                if (aInt % i == 0) {
                    System.out.print(i + "   ");
                }
            }
        }

    }
}