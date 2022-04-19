package src.Homework04;

/**
 * 定义个Person类，属性有身份证号码、姓名、性别、年龄、籍贯、住址，行为包括：
 * （1）eating(String food)，能够表示吃什么食物；
 * （2）shopping(String goods)，表示购物；
 * （3）sleeping(int time),表示睡觉，参数time表示睡觉的时长；
 * （4）setName(String aName),表示修改人的姓名；
 * （5）setAge(int aAge)，表示修改人的年龄；
 * （6）printPerson()，表示打印人的所有信息。
 * 要求，实例化一个对象，调用该对象所有的方法。new对象时，画出内存的变化。
 */
public class Person {
    private String id;// 身份证号码
    private String name;// 姓名
    private String sex;// 性别
    private int age;// 年龄
    private String orige;// 籍贯
    private String add;// 地址

    public Person(String id, String name, String sex, int age, String orige, String add) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.orige = orige;
        this.add = add;
    }

   public Person() {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    /**
     * (4)表示修改人的姓名
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    /**
     * （5）表示修改人的年龄
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String getOrige() {
        return orige;
    }

    public void setOrige(String orige) {
        this.orige = orige;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    /**
     * （1） 表示吃什么食物
     * 
     * @param food
     */
    public void eating(String food) {
        System.out.println("吃" + food);
    }

    /**
     * （2）表示购物
     * 
     * @param goods
     */
    public void shopping(String goods) {
        System.out.println("去买" + goods);
    }

    /**
     * (3)表示睡觉
     * 
     * @param time
     */
    public void sleeping(int time) {
        System.out.println("睡了" + time + "小时");
    }

    /**
     * (6) 打印人的所有信息
     */
    public void printPerson() {
        System.out.println("身份证号码：" + this.id + "\n" +
                "姓名：" + this.name + "\n" + "性别：" + this.sex + "\n" +
                "年龄：" + this.age + "\n" + "籍贯：" + this.orige + "\n" +
                "住址：" + this.add);
    }

    public static void main(String[] args) {
        Person person = new Person("340333333333", "朱军军", "男", 20, "23131", "天津");// 原来定的信息
        person.shopping("老痰酸菜");// （2）购物
        person.eating("白象");// （1）吃
        person.sleeping(8);// （3）睡觉
        person.setName("小红");// （4）改姓名
        person.setAge(8);// （5）改年龄
        person.printPerson();// （6）打印信息
     //   Person p = new Person();
    }

}
