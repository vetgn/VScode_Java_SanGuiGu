package src.Inheritance.Overrise;

public class Person {
    
    public void eat(){
        System.out.println("吃饭");
        System.out.println(info01());
    }

    public void walk(){
        System.out.println("走路");
        info();
    }

    private void info(){
        System.out.println("我是一个人");
    }

    public Object info01(){
        return "人类";
    }
}
