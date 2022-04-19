/*
 * @Author: vetgn
 * @Date: 2022-04-07 21:09:53
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-09 12:37:16
 * @FilePath: \Project_3\src\team_domain\Programmer.java
 * @Description: 程序员
 * 
 */
package team_domain;

import team_service.Status;

public class Programmer extends Employee {
    private int memberId;// 开发团队中的id
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {

    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    /**
     * 输出公司中程序员的信息
     */
    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
    }

    /**
     * 输出团队中程序员的信息
     * @return
     */
    public String getDetailsForTeam() {
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t" + "程序员";
    }
}
