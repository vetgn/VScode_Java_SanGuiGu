package src.Homework02;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        One one = new One();
        one.info();
    }

    
    public void info(){
        int total = 0;// 记录奖票的数量
        try (Scanner scan = new Scanner(System.in)) {
            //进行号码的判断
            for (;;) {
                System.out.print("请输入号码：");
                String str = scan.next();
                if (str.equals("f") || str.equals("F")) {
                    System.out.println("一等奖!\t奥迪Q5");
                    total++;
                } else if (str.equals("s") || str.equals("S")) {
                    System.out.println("二等奖!\t吉利博越");
                    total++;
                } else if (str.equals("t") || str.equals("T")) {
                    System.out.println("三等奖!\t奇瑞QQ");
                    total++;
                } else if (str.equals("over")) {
                    break;
                } else {
                    System.out.println("没有中奖");
                    total++;
                }

            }
        }
        //结束以后进行总的输出
        System.out.println("用了" + total + "奖票" + "花了" + 2 * total + "元");
    }

}
