/*
 * @Author: vetgn
 * @Date: 2022-05-23 19:20:45
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-23 22:30:43
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework13\ArrayListTest.java
 * @Description: 
 * 
 */
package src.Homework13;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> arrList = new ArrayList<>();
        Student student1 = new Student("王振", 1401011001, 20, "计算机");
        Student student2 = new Student("刘莉莉", 1403020115, 19, "机械");
        Student student3 = new Student("王红", 1601040316, 17, "化工");

        arrList.add(student1);
        arrList.add(student2);
        arrList.add(student3);

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(
                    arrList.get(i).getName() + "," + arrList.get(i).getId() + "," + arrList.get(i).getAge() + ","
                            + arrList.get(i).getMajor());
        }

        Student student4 = new Student("张芳", 1604010101, 17, "材料");

        arrList.add(1, student4);
        System.out.println("插入后:");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(
                    arrList.get(i).getName() + "," + arrList.get(i).getId() + "," + arrList.get(i).getAge() + ","
                            + arrList.get(i).getMajor());
        }
    }
}

class Student {
    private String name;
    private long id;
    private int age;
    private String major;

    public Student(String name, long id, int age, String major) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}