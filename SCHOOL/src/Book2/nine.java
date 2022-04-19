package src.Book2;

import java.util.Scanner;

/**
 * 输入秒，输出 时\分\秒
 * 1分 = 60 秒
 * 1时 = 60 分
 * 1时 = 3600 秒
 */
public class nine {
    public static void main(String[] args) {
        int hour = 0;// 小时
        int minute = 0;// 分钟
        int second = 0;// 秒
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("请输入秒:");
            int num = scan.nextInt();
            if (num > 3600) {
                hour = num/3600;
                minute = (num-3600)/60;
                second = num - hour*3600 - minute*60;
            }else if(num==3600){
                hour=1;
            }else if(num<3600&&num>60){
                minute = num/60;
                second = num - minute*60;
            }else if(num==60){
                minute =1;
            }else if(num>=0){
                second = num;
            }
        }
        System.out.print(hour + "时" + minute + "分" + second + "秒");
    }
}
