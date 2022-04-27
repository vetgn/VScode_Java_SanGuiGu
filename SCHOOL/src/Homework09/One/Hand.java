/*
 * @Author: vetgn
 * @Date: 2022-04-27 19:30:49
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-27 19:59:53
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework09\Hand.java
 * @Description: 
 * 定义Hand类，要求如下：
 * (1)私有成员变量包括手指长度length，手掌面积area和握力grip；
 * (2)定义构造方法初始化所有成员变量;
 * (3)省略setter和getter方法；
 * (4)功能方法包括：catching(String thing)方法抓东西，getInfo()方法取得Hand的所有信息。
 * 
 */
package src.Homework09.One;

public class Hand {
    // (1)私有成员变量包括手指长度length，手掌面积area和握力grip；
    private String length;// 手指长度
    private String area;// 手掌面积
    private String grip;// 握力
    // (2)定义构造方法初始化所有成员变量;

    public Hand() {
    }

    public Hand(String length, String area, String grip) {
        this.length = length;
        this.area = area;
        this.grip = grip;
    }
    // (4)功能方法包括：catching(String thing)方法抓东西，getInfo()方法取得Hand的所有信息。

    /**
     * catching(String thing)方法抓东西
     * 
     * @param thing
     */
    public String catching(String thing) {
        return "拿" + thing;
    }

    /**
     * getInfo()方法取得Hand的所有信息
     * 
     * @return
     */
    public String getInfo() {
        return "手指长度:" + length + "\t" + "手掌面积:" + area + "\t" + "握力:" + grip;
    }
}
