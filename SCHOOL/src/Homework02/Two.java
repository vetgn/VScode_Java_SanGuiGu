package src.Homework02;

import java.util.Scanner;

public class Two {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Two two = new Two();
        two.menu();
    }

    /**
     * 输出菜单
     */
    public void menu() {
        System.out.println("\n**********学生管理系统**********");
        System.out.println("**********1. 查询**********");
        System.out.println("**********2. 增加**********");
        System.out.println("**********3. 修改**********");
        System.out.println("**********4. 删除**********");
        System.out.println("**********0. 退出**********");
        System.out.print("**********输入(0-4):");
        char menu = scan.next().charAt(0);
        if (menu > '4' || menu < '0') {
            System.out.println("输入错误");
            menu();

        }

        switch (menu) {
            case '0':
                System.out.print("是否确认退出？(Y/N):");
                char menu01 = scan.next().charAt(0);
                if (menu01 == 'Y') {
                    break;
                } else if (menu01 == 'N') {
                    menu();
                } else {
                    System.out.println("输入错误，请重新输入");
                    menu();
                }
            case '1':
                ListAllStudent();
                menu();
                break;
            case '2':
                addStudent();
                menu();
                break;
            case '3':
                replaceStudent();
                menu();
                break;
            case '4':
                deleteStudent();
                menu();
                break;
        }
    }

    /**
     * 查询学生信息
     */
    public void ListAllStudent() {
        System.out.println("查询学生信息 ");
    }

    /**
     * 增加学生信息
     */
    public void addStudent() {
        System.out.println("增加学生信息 ");
    }

    /**
     * 修改学生信息
     */
    public void replaceStudent() {
        System.out.println("修改学生信息 ");
    }

    /**
     * 删除学生信息
     */
    public void deleteStudent() {
        System.out.println("删除学生信息 ");
    }
}
