/*
 * @Author: vetgn
 * @Date: 2022-04-24 14:40:21
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-24 14:47:48
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework08\Two\Book.java
 * @Description: 
 * （2）Book：有两个私有成员变量：大小bookSize(double 类型)、
 * 页数bookPages（int 类型）。
 * 带5个参数的构造方法
 * （3）Book类中有一个showMessage()方法，输出所有信息，
 * 示例：
 * 本书籍信息：
 * 名称：**；ISBN_NO：**；价格：**
 * 大小：**；页码：**
 * 其中**为以上对象的相应成员变量值。
 */
package src.Homework08.Two;

public class Book extends Publication {
    private double bookSize;
    private int bookPages;

    public Book() {
    }

    public Book(String name, String iSBN_NO, double price, double bookSize, int bookPages) {
        super(name, iSBN_NO, price);
        this.bookSize = bookSize;
        this.bookPages = bookPages;
    }

    public double getBookSize() {
        return bookSize;
    }

    public void setBookSize(double bookSize) {
        this.bookSize = bookSize;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    /**
     * 示例：
     * 本书籍信息：
     * 名称：**；ISBN_NO：**；价格：**
     * 大小：**；页码：**
     * 其中**为以上对象的相应成员变量值
     */

    @Override
    public void showMessage() {
        System.out.println("名称：" + super.getName() + "\t"
                + "ISBN_NO:" + super.getISBN_NO() + "\t" + "价格:" +
                super.getPrice() + "\n" + "大小:" + bookSize + "\t" +
                "页码:" + bookPages);
    }
}
