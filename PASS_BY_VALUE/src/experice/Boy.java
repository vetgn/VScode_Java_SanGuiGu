package src.experice;

//this练习

public class Boy {
    private String name;
    private int age;

    public Boy() {

    }

    public Boy(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marry(Girl girl) {
        System.out.println("我想和" + girl.getName() + "结婚");
    }

    public void shout() {
        if (age >= 22) {
            System.out.println("你可以合法登记！");
        } else
            System.out.println("无法合法登记!");
    }
}
