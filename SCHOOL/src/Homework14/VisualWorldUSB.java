package src.Homework14;

/*
 * @Author: vetgn
 * @Date: 2022-06-09 08:54:41
 * @LastEditors: vetgn
 * @LastEditTime: 2022-06-09 08:56:55
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework14\VisualWorldUSB.java
 * @Description: 
 * 
 */
public class VisualWorldUSB implements IUSB,IMouse{

    @Override
    public void mousePressed() {
        System.out.println("VisualWorldUSB鼠标按键被按下");        
    }

    @Override
    public void mouseReleased() {
       System.out.println("VisualWorldUSB鼠标按键被松开。");
        
    }

    @Override
    public void readDate() {
        System.out.println("VisualWorldUSB正在读数据！");
        
    }
    
}
