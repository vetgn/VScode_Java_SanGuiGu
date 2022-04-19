package src.Inheritance.Introduction;

public class Person {
    int age;
    private char gender;//age与gender故意分开

    public void eat() {
        System.out.println("人会吃饭!");
    }

    public void sleep() {
        System.out.println("人会睡觉!");
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
