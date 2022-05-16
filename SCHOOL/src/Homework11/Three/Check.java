/*
 * @Author: vetgn
 * @Date: 2022-05-15 23:12:09
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-16 07:31:56
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework11\Three\Check.java
 * @Description: 
 * （2）定义检查酒驾类Check，该类的成员方法drunkDriving（）throws AlcoholException,
 * 如果某人的酒精含量超标利用throw抛出AlcoholException异常对象。
 * 
 */
package src.Homework11.Three;

public class Check {
    public void drunkDriving(int i)throws AlcoholException{
        if(i <0){
            throw new AlcoholException("酒精含量超标!");
        }
    }
}
