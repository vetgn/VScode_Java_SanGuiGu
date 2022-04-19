/*
 * @Author: vetgn
 * @Date: 2022-04-11 14:49:39
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-11 15:11:34
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Book4\One\Line.java
 * @Description: 
 * 
 */
package src.Book4.One;

public class Line {
    private float x1, y1, x2, y2;

    public Line(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // 计算长度
    public float Length() {
        return (float) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public static void main(String[] args) {
        Line line = new Line(1.1f, 1f, 23f, 5f);
        System.out.println(line);
    }

   @Override
   public String toString() {
       return "x1=" + x1;
   }
}
/*
 * @Author: vetgn
 * 
 * @Date: 2022-04-11 14:49:39
 * 
 * @LastEditors: vetgn
 * 
 * @LastEditTime: 2022-04-11 14:51:24
 * 
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Book4\One\Line.java
 * 
 * @Description:
 * 
 */
