/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:01:46
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 13:11:25
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\One\Equipment.java
 * @Description: 
 * 
 */
package src.Homework12.One;

public abstract class Equipment {
    private String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
