/*
 * @Author: vetgn
 * @Date: 2022-04-07 21:17:36
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-09 13:00:59
 * @FilePath: \Project_3\src\team_domain\Architect.java
 * @Description: 架构师
 * 
 */
package team_domain;

public class Architect extends Designer {
    private int stock;// 股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * 输出公司中架构师信息
     */
    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t"
                + getEquipment().getDescription();
    }

    /**
     * 输出团队中架构师的信息
     */
    public String getDetailsForTeam() { 
        return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t" + "架构师\t" + getBonus() + "\t" + getStock();
    }
}
