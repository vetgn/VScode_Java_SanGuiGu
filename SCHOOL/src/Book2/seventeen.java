package src.Book2;

import java.util.Scanner;

/**
 * 求一元一次方程的根
 */
public class seventeen {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("请输入方程的系数A、B、C:");
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();
            if (B * B - 4 * A * C < 0) {
                System.out.println("无解");
            } else {

                double x1 = (-B + Math.sqrt(B * B - 4 * A * C)) / (2 * A);
                double x2 = (-B - Math.sqrt(B * B - 4 * A * C)) / (2 * A);

                System.out.println("方程的根:" + "x1= " + x1 + "\t" + "x2= " + x2);
            }
        }
    }
}
