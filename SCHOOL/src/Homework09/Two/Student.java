/*
 * @Author: vetgn
 * @Date: 2022-04-27 20:33:11
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 21:53:04
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\Two\Student.java
 * @Description: 
 * 定义Student类继承Person，要求如下：
 * (1)成员变量包括学号studentID,班级className，成绩score，学校名schoolName是public static成员；
 * (2)定义一个空构造方法，定义一个能够初始化所有成员变量的构造方法；
 * (3) 省略setter和getter方法；
 * 
 * (4)功能方法包括：
 * 重写Object中的toString()方法返回有意义的Student对象信息，
 * 定义实体方法takeLesson(String course)表示学生选修了一门课程，
 * 重写父类working(String information)方法表示学生正在学习某个内容。
 * 
 */
package src.Homework09.Two;

public class Student extends Person {
    // (1)成员变量包括学号studentID,班级className，成绩score，学校名schoolName是public static成员；
    private String studentID;// 学号
    private String className;// 班级
    private float score;// 成绩
    public static String schoolName = "天津城建大学";// 学校名
    // (2)定义一个空构造方法，定义一个能够初始化所有成员变量的构造方法；

    public Student() {
    }

    public Student(String id, String name, String sex, String birthday) {
        super(id, name, sex, birthday);
    }

    public Student(String id, String name, String sex, String birthday, String studentID, String className,
            float score) {
        super(id, name, sex, birthday);
        this.studentID = studentID;
        this.className = className;
        this.score = score;
    }
    // (4)功能方法包括：

    /**
     * 重写Object中的toString()方法返回有意义的Student对象信息，
     */
    @Override
    public String toString() {
        return super.toString() + "studentID:" + studentID + "\n" +
                "className:" + className + "\t" + "score:" + score + "\t" + "schoolName:"
                + schoolName;
    }

    /**
     * 定义实体方法takeLesson(String course)表示学生选修了一门课程，
     * 
     * @param course
     */
    public void takeLesson(String course) {
        System.out.println(super.getName() + "选择了" + course);
    }

    /**
     * 重写父类working(String information)方法表示学生正在学习某个内容。
     */
    @Override
    public void working(String information) {
        System.out.println(super.getName() + "在学" + information);
    }

}
