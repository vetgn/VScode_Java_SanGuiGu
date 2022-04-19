/*
 * @Author: vetgn
 * @Date: 2022-04-18 21:32:31
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-18 21:43:36
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\HomeWord07\Two\Phone.java
 * @Description: 
 * 手机（Phone）由主板（MainBoard）和屏幕（Screen）组成。为此编写如下代码：
 * （1）MainBoard类，包含私有属性：品牌brand（String类型）和价格price（double类型）；带有两个参数的构造方法；getBrand()和getPrice()方法
 * （2）Screen类，包含私有属性：品牌brand（String类型）和价格price（double类型）；带有两个参数的构造方法；getBrand()和getPrice()方法
 * （3）Phone类，包含私有属性：品牌brand（String类型）、主板mainBoard（MainBoard 类型）、屏幕screen（Screen类型）；
 * 带有三个参数的构造方法；一个showMessage()方法，输出信息样例如下：
 * 手机品牌：**；价格：****
 * 主板品牌：**；主板价格：**
 * 屏幕品牌：**；屏幕价格：**
 * 其中：**为各对象中定义的成员变量值；****为主板和屏幕价格之和。
 * （4）测试类Test
 * main方法中：创建MainBoard和Screen对象；利用前两个对象，创建Phone对象。最后调用Phone对象的showMessage方法，输出所有信息。
 * 创建对象中的所需数据按需求自行编写。
 * 
 */
package src.HomeWord07.Two;

public class Phone {
    private String brand;
    private MainBoard mainBoard;
    private Screen screen;

    public Phone() {
    }

    public Phone(String brand, MainBoard mainBoard, Screen screen) {
        this.brand = brand;
        this.mainBoard = mainBoard;
        this.screen = screen;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    // 手机品牌：**；价格：****
    // 主板品牌：**；主板价格：**
    // 屏幕品牌：**；屏幕价格：**
    // 其中：**为各对象中定义的成员变量值；****为主板和屏幕价格之和。
    public void showMessage() {
        System.out.println("手机品牌：" + brand + ";" + "价格：" + (mainBoard.getPrice() + screen.getPrice()));
        System.out.println("主机品牌：" + mainBoard.getBrand() + ";" + "主板价格：" + mainBoard.getPrice());
        System.out.println("屏幕品牌：" + screen.getBrand() + ";" + "屏幕价格：" + screen.getPrice());
    }
}
