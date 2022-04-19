public class project01 {
    public static void main(String[] args) {
        // 创建Person的对象
        Person p1 = new Person();
        System.out.println(p1.age);

        p1.name = "Tom";
        System.out.println(p1.name);

        p1.isMale = true;
        System.out.println(p1.isMale);

        p1.eat();
        p1.sleep();
        p1.talk("China");

        Person p2 = p1;
        System.out.println(p2.name);

    }
}

class Person {
    int age = 20;
    String name;
    boolean isMale;

    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String langeage) {
        System.out.println("人可以说话" + langeage);
    }
}