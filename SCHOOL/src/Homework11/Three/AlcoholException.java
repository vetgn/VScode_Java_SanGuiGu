/*
 * @Author: vetgn
 * @Date: 2022-05-15 23:11:40
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-16 07:32:10
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework11\Three\AlcoholException.java
 * @Description: 3.异常处理的综合应用
（1） 定义酒精含量异常类AlcoholException；
 * 
 */
package src.Homework11.Three;

public class AlcoholException extends Exception {
    static final long serialVersionUID = -7034897190745766939L;

    public AlcoholException() {

    }

    public AlcoholException(String msg) {
        super(msg);
    }
}
