/*
 * @Author: vetgn
 * @Date: 2022-05-15 22:45:07
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-16 07:33:54
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework11\Ticket.java
 * @Description: 
 * 1. 提取准考证号码包含的信息。
 * (1)准考证号码是一串数字字符串，1-2位表示考场号，3-4位表示考室号，5-8位表示考生序号，
 * 第9位表示考试类型（1表示A类，2表示B类，3表示C类）。
 * 例如一个准考证号码250323673表示的考场号是25,考室是03，考生序号是2367，考试类型“C类”。
 * 
 * (2)在准考证号码的最前面插入学校代码，把天津城建大学代码“10792”插入之后“10792250323673”。
 * 
 */
package src.Homework11;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        String exam_id;// 准考证号码
        String exam_number;// 考场号
        String exam_room_number;// 考室号
        String exam_student_number;// 考生序号
        String exam_type;// 考试类型
        String School_id = "10792";// 学校代码
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("请输入自己的准考证号：");
            exam_id = scanner.next();
        }
        exam_number = exam_id.substring(0, 2);

        exam_room_number = exam_id.substring(2, 4);

        exam_student_number = exam_id.substring(4, 8);

        exam_type = exam_id.substring(8);
        if (exam_type.equals("1")) {
            exam_type = "A类";
        } else if (exam_type.equals("2")) {
            exam_type = "B类";
        } else if (exam_type.equals("3")) {
            exam_type = "c类";
        }
        System.out.println("考场号:" + exam_number + "  " +
                "考室:" + exam_room_number + "  " + "考生序号:" +
                exam_student_number + "  " + "考试类型:" + exam_type);

        System.out.println("加入学校代码后：" + School_id + exam_id);
    }

}
