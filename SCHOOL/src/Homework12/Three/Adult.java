/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:40:41
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 14:02:31
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\Three\Adult.java
 * @Description: 
 * 
 */
package src.Homework12.Three;

public class Adult extends People {
    private boolean marriage;
    private String address;

    public String recreation() {
        return super.getName() + "的娱乐爱好是五禽戏";
    }

    public Adult() {
    }

    public Adult(String name, String sex, int age, boolean marriage, String address) {
        super(name, sex, age);
        this.marriage = marriage;
        this.address = address;
    }

    public boolean isMarriage() {
        return marriage;
    }

    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
