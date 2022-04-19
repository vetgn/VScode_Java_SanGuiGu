package src.Homework01;

import java.util.Scanner;

public class Topic_2_3Test {
    public static void main(String[] args) {
        Topic_2_3 topic_2_3 = new Topic_2_3();

        try (Scanner scan = new Scanner(System.in)) {
            // 输入姓名
            System.out.print("请输入你的姓名：");
            String name = scan.next();
            topic_2_3.setName(name);

            // 输入年龄
            System.out.print("请输入你的年龄：");
            int age = scan.nextInt();
            topic_2_3.setAge(age);

            // 输入身高
            System.out.print("请输入你的身高：");
            int height = scan.nextInt();
            topic_2_3.setHeight(height);

            // 输入籍贯
            System.out.print("请输入你的籍贯：");
            int native_place = scan.nextInt();
            topic_2_3.setNative_place(native_place);
        }

        System.out.println("\n您的信息为:"+"\n姓名：" + topic_2_3.getName()
                + '\n' + "年龄：" + topic_2_3.getAge() + '\n'
                + "身高：" + topic_2_3.getHeight() + '\n' + "籍贯：" +
                topic_2_3.getNative_place());
    }
}