package src.Homework01;

import java.util.Scanner;

public class Topic_2_4 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        int grade[] = new int[100];
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("请输入学生的成绩(输入-1结束)：");
            for (;;) {

                int g = scan.nextInt();
                if (g!=-1) {
                    grade[i] = g;
                    sum += grade[i];
                    i++;
                } else
                    break;

            }
        }
        System.out.println("总成绩为" + sum);

        System.out.println("成绩的平均数为" + sum / i);
    }
}