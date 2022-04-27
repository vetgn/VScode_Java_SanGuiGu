/*
 * @Author: vetgn
 * @Date: 2022-04-27 21:15:09
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 21:58:21
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\Two\Test.java
 * @Description: 
 * 
 * 定义测试类，完成如下任务：
 * (1)创建学生对象孙悟空swk，输出swk的所有信息，swk选修了体育课程，swk正在学习体育课；
 * (2)创建教师对象菩提祖师ptzs，输出ptzs的所有信息，ptzs在准备体育课内容，ptzs在给swk讲授体育课。
 */
package src.Homework09.Two;

public class Test {
    public static void main(String[] args) {
        // 创建学生对象孙悟空swk
        Student swk = new Student("12323424", "孙悟空", "男", "1月2日", "123", "计算机1班", 12.7f);
        // 输出swk的所有信息
        System.out.println(swk.toString());
        // swk选修了体育课程
        swk.takeLesson("体育");
        // swk正在学习体育课
        swk.working("习体育课");
        System.out.println();
        // 创建教师对象菩提祖师ptzs
        Teacher ptzs = new Teacher("32454574", "菩提祖师", "女", "5月8日", "678", "数学部门", 100);
        // 输出ptzs的所有信息
        System.out.println(ptzs.toString());
        // ptzs在准备体育课内容
        ptzs.working("体育课内容");
        // ptzs在给swk讲授体育课
        ptzs.teaching(swk, "体育课");
    }
}
