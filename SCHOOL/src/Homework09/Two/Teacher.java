/*
 * @Author: vetgn
 * @Date: 2022-04-27 20:33:22
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 21:59:33
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\Two\Teacher.java
 * @Description: 
 * 定义Teacher类继承Person，要求如下：
 * (1)成员变量包括教师工号teacherID,部门department，工资salary，学校名schoolName是public static成员；
 * (2)定义一个空构造方法，定义一个能够初始化所有成员变量的构造方法；
 * (3) 省略setter和getter方法；
 * 
 * (4)功能方法包括：
 * 重写Object中的toString()方法返回有意义的Teacher对象信息，
 * 定义实体方法teaching(Student student,String course)表示为学生授课，
 * 重写父类working(String information)方法表示老师正在准备课程
 * 
 */
package src.Homework09.Two;

public class Teacher extends Person {
    // (1)成员变量包括教师工号teacherID,部门department，工资salary，学校名schoolName是public static成员
    private String teacherID;// 教师工号
    private String department;// 部门
    private double salary;// 工资
    public static String schoolName = "天津城建大学";// 学校名
    // (2)定义一个空构造方法，定义一个能够初始化所有成员变量的构造方法；

    public Teacher(String teacherID, String department, double salary) {
        this.teacherID = teacherID;
        this.department = department;
        this.salary = salary;
    }

    public Teacher() {
    }

    public Teacher(String id, String name, String sex, String birthday, String teacherID, String department,
            double salary) {
        super(id, name, sex, birthday);
        this.teacherID = teacherID;
        this.department = department;
        this.salary = salary;
    }

    // (4)功能方法包括：

    /**
     * 重写Object中的toString()方法返回有意义的Teacher对象信息，
     */
    @Override
    public String toString() {
        return super.toString() + "teacherID:" + teacherID
                + "\n" + "department:" + department + "\t" +
                "salary" + salary + "\t" + "schoolName:" + schoolName;
    }

    /**
     * 定义实体方法teaching(Student student,String course)表示为学生授课，
     * 
     * @param student
     * @param course
     */
    public void teaching(Student student, String course) {
        System.out.println(super.getName() + "为" + student.getName() + "授" + course);
    }

    /**
     * 重写父类working(String information)方法表示老师正在准备课程
     */
    @Override
    public void working(String information) {
        System.out.println(super.getName() + "正在准备" + information);
    }
}
