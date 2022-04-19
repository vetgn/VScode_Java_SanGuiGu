/*
 * @Author: vetgn
 * @Date: 2022-04-07 20:59:17
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-09 12:39:37
 * @FilePath: \Project_3\src\team_service\Status.java
 * @Description: 表示员工的状态
 * 
 */
package team_service;

public class Status {
    private final String NAME;

    private Status(String name) {
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");// 空闲
    public static final Status BUSY = new Status("BUSY");// 已加入开发团队
    public static final Status VOCATION = new Status("VOCATION");// 表示正在休假

    /**
     * 得到状态
     * @return
     */
    public String getNAME() {
        return NAME;
    }
    @Override
    public String toString() {
        return NAME;
    }
}
