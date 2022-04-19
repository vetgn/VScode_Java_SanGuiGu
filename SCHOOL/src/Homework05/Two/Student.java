package src.Homework05.Two;

/**
 * 定义Student类，要求如下：
 * 
 * （1）私有化成员变量name，age和数据结构成绩ds和英语成绩English；
 * 
 * （2）定义3个构造方法；
 * 
 * （3）定义setter和getter方法；
 * 
 * （4）定义3个功能方法，计算总分total( )，计算平均分average( )，输出某人的所有信息printStudent()。
 * 
 * （5）定义测试类Demo，测试Student类的方法。
 */
public class Student {

    // （1）私有化成员变量name，age和数据结构成绩ds和英语成绩English
    private String name;
    private int age;
    private double ds;// 数据结构成绩
    private double English;// 英语成绩

    // （2）定义3个构造方法
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, double ds, double english) {
        this.name = name;
        this.age = age;
        this.ds = ds;
        English = english;
    }

    // （3）定义setter和getter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDs() {
        return ds;
    }

    public void setDs(double ds) {
        this.ds = ds;
    }

    public double getEnglish() {
        return English;
    }

    public void setEnglish(double english) {
        English = english;
    }

    // （4）定义3个功能方法，计算总分total( )，计算平均分average( )，输出某人的所有信息printStudent()。

    /**
     * 计算总分
     */
    public double total() {
        return this.ds + this.English;
    }

    /**
     * 计算平均分
     */
    public double average() {
        return this.total() / 2;
    }

    /**
     * 输出某人的所有信息
     */
    public void printStudent() {
        System.out.println("姓名为：" + this.name + "\n" +
                "年龄为：" + this.age + "\n" + "数据结构成绩为：" +
                this.ds + "\n" + "英语成绩为：" + this.English + "\n" +
                "总成绩为：" + this.total() + "\n" +
                "平均成绩为：" + this.average());
    }
}
