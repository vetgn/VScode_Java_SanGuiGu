package src.Homework04;

import java.util.Scanner;

/**
 * 设计一个表示书本的Book类，要求入下：
 * 1. 私有化的数据成员包括书名，出版社名，作者（可能有多个，采用字符串数组），价格，页数。
 * 2. 功能方法：（1）输出书名、出版社名和作者的方法；（2）输出书籍所有信息的方法；（3）做笔记的方法,即方法参数（String note），方法体为输出
 * note
 * 
 * 二、对Book类测试要求如下：
 * 1. 实例化一本书，然后设置新的价格和页数。
 * 2. 输出这本书的所有信息
 * 3. 做笔记，笔记内容是“环境保护，从我做起”。
 */
public class Book {

    public static void main(String[] args) {
        Book book = new Book("《活着》", "中作华文", 20, 100);
        String[] arr = new String[]{"we","ds","fs"};
        //String[] writer = new String[] { "小明", "小红", "小王" };
        Book a = new Book(arr);
        //book.setWriters(writer);
        book.printAll();
    }

    static String info;
    private String book_name;// 书名
    private String press;// 出版社名
    private String[] writers;// 作者
    private int money;// 价格
    private int page;// 页数
    private String note;// 笔记

    // 判断是否做笔记,如果做,则输入笔记内容
    {
        System.out.print("是否做笔记？(Y/N)：");
        try (Scanner scan = new Scanner(System.in)) {
            info = scan.next();
            if (info.equals("Y") || info.equals("y")) {
                System.out.print("请输入笔记内容：");
                String n = scan.next();
                this.setNote(n);
            }
        }
    }

    public Book(String book_name, String press, int money, int page) {
        this.book_name = book_name;
        this.press = press;
        this.money = money;
        this.page = page;
    }

    public Book(String[] writers){
        this.writers = writers;
    }

    public Book() {
    }

    public String getNote() {
        return note;
    }

    /**
     * 做笔记的方法
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String[] getWriters() {
        return writers;
    }

    public void setWriters(String[] writers) {
        this.writers = writers;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    /**
     * 输出书名、出版社名和作者的方法
     */
    public void print_Book_Press_writers() {
        System.out.println("书名：" + this.book_name + "\n" +
                "出版社名：" + this.press);
        System.out.print("作者名：");
        for (int i = 0; i < this.writers.length; i++) {
            System.out.print(writers[i] + "   ");
        }
        System.out.println();
    }

    /**
     * 输出书籍的所有信息
     */
    public void printAll() {
        this.print_Book_Press_writers();
        System.out.println("价格：" + this.money + "\n" +
                "页数：" + this.page);
        if (info.equals("Y") || info.equals("y")) {
            System.out.println("笔记：" + this.getNote());
        }
    }

}
