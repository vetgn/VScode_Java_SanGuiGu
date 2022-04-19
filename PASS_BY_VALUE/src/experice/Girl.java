package src.experice;

//this练习

public class Girl {
    private String name;
    private int age;

    public Girl() {

    }

    public Girl(String name, int age) {
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

    public void marry(Boy boy) {
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);//this 指的是当前对象
    }

    /**
     * 这是比较两个人的年纪大小,this.age指当前对象，即本类里的对象，而girl.age指加入的对象
     * @param girl
     * @return
     */

    public int compare(Girl girl) {
        return this.age - girl.age;
    }
}
