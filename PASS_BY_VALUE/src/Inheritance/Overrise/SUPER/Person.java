package src.Inheritance.Overrise.SUPER;

public class Person {
    String name;
    int age;
    int id = 1001;//身份号

    public Person(){
    }

    public Person(int i){
        System.out.println("数字为" + i);
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name ,int age){
        this(name);
        this.age = age;
    }

    public void eat(){
        System.out.println("人,吃饭");
    }

    public void walk(){
        System.out.println("人，走路");
    }
}
