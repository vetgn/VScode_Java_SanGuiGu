/*
 * @Author: vetgn
 * @Date: 2022-04-07 21:15:27
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-09 13:00:23
 * @FilePath: \Project_3\src\team_domain\Designer.java
 * @Description: 设计师
 * 
 */
package team_domain;

public class Designer extends Programmer {
    private double bonus;// 奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * 输出公司中设计师的信息
     */
    @Override
    public String toString() {
        return getDetails()+"\t设计师\t" + getStatus() + "\t" +bonus + "\t\t" +getEquipment().getDescription();
    }

    /**
     * 输出团队中设计师的信息
     */
    public String getDetailsForTeam() {
        return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t" + "设计师\t" + getBonus();
    }
}
