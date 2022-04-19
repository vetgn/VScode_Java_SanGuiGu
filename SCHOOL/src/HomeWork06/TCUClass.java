/*
 * @Author: vetgn
 * @Date: 2022-04-14 20:50:06
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-14 21:38:31
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\HomeWork06\TCUClass.java
 * @Description: 
 * 
 */
package src.HomeWork06;

public class TCUClass {
    // (1)
    private String classId;// 编号
    private String slogan;//口号

    public TCUClass() {
    }

    public TCUClass(String classId, String slogan) {
        this.classId = classId;
        this.slogan = slogan;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

}
