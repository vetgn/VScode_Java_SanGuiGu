/*
 * @Author: vetgn
 * @Date: 2022-04-07 20:31:45
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-09 21:46:54
 * @FilePath: \Project_3\src\team_domain\PC.java
 * @Description: 
 * 
 */
package team_domain;

public class PC implements Equipment {

    private String model;// 机器型号
    private String display;// 显示器名称

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }

}
