/*
 * @Author: vetgn
 * @Date: 2022-04-08 11:47:15
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-08 11:49:41
 * @FilePath: \Project_3\src\team_service\TeamException.java
 * @Description: 自定义异常类
 * 
 */
package team_service;

public class TeamException extends Exception{
    static final long serialVersionUID = -338751648L;

    private TeamException(){
        super();
    }

    public TeamException(String msg){
        super(msg);
    }
}
