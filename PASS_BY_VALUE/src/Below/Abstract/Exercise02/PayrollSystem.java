package src.Below.Abstract.Exercise02;

import java.util.Scanner;

/**
 * (5)定义PayrollSystem类,创建Employee变量数组并初始化,该数组存放各类雇员对象的引用。
 * 利用循环结构遍历数组元素,输出各个对象的类型,name,number,birthday
 * 当键盘输入本月月份值时,如果本月是某个Employee对象的生日,
 * 还要输出增加工资信息
 */
public class PayrollSystem {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("请输入月份:");
            int month = scan.nextInt();
            Employee[] employees = new Employee[2];
            employees[0] = new SalariedEmployee("马森", 1001, new MyDate(1992, 2, 2), 10000);
            employees[1] = new HourlyEmployee("小王", 1002, new MyDate(1995, 5, 6), 60, 240);
            for (int i = 0; i < 2; i++) {
                System.out.println(employees[i]);// 会自动调用toString方法
                double salary = employees[i].earnings();
                System.out.println("月工资为" + salary);
                if (month == employees[i].getBirthday().getMonth()) {
                    System.out.println("生日快乐!,奖励100元F");
                }
            }
        }
    }
}
