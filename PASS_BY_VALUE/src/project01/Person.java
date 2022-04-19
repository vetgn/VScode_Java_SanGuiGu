package src.project01;

public class Person {

    private int age;
    private String name;

    public Person() {
        age = 18;// 初始所有人的年龄为18
    }

    public Person(int a, String n) {
        age = a;
        name = n;
    }

    public void setAge(int a) {
        if (a < 0 || a > 130) {
            System.out.println("输入有误！");
        } else {
            age = a;
        }

    }

    public int getAge() {
        return age;
    }

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }
}
