package src.Inheritance.Overrise.SUPER;

public class Student extends Person{
    String major;
    int id = 1002; //学号

    public Student(){
        //super();//默认系统自动添加
    }

     public Student(int i){
         super(i);
    }

    public Student(String major){
        this.major = major;
    }

    public void eat(){
        System.out.println("学生,多吃有营养的食物");
    }

    public void study(){
        System.out.println("学生，学习");
    }

    public void show(){
        System.out.println("id = " + this.id);
        System.out.println("****************");
        System.out.println("id = " + super.id);
    }
}
