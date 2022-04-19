/*
 * @Author: vetgn
 * @Date: 2022-04-08 16:14:23
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-10 18:52:36
 * @FilePath: \Project_3\src\team_service\TeamService.java
 * @Description: 关于开发团队成员的管理、添加、删除等。
 * 
 */
package team_service;

import team_domain.Architect;
import team_domain.Designer;
import team_domain.Employee;
import team_domain.Programmer;

public class TeamService {
    private static int counter = 1;// 给memberId赋值使用
    private final int MAX_MEMBER = 5;// 限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];// 保存开发团队成员
    private int total;// 记录开发团队中实际的人数

    public TeamService() {
        super();
    }

    /**
     * @description: 获取开发团队中所有成员
     * @param {*}
     * @return {*}
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * @description: 将指定员工添加到开发团队里
     * @param {*}
     * @return {*}
     */
    public void addMember(Employee e) throws TeamException {

        // 成员已满,无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满,无法添加");
        }
        // 该成员不是开发人员,无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员,无法添加");
        }
        // 该员工已在本开发团队中
        if (isExist(e)) {
            throw new TeamException("该员工已在本开发团队中");
        }
        // 该员工已是某团队成员
        // 该员正在休假,无法添加
        Programmer p = (Programmer) e;// 由于上方有instanceof因此不用再写

        if ("BUSY".equals(p.getStatus().getNAME())) {
            throw new TeamException("该员工已是某团队成员");
        } else if ("VOCATION".equals(p.getStatus().getNAME())) {
            throw new TeamException("该员正在休假,无法添加");
        }
        // 团队中至多只能有一名架构师
        // 团队中至多只能有两名设计师
        // 团队中至多只能有三名程序员

        int numofArch = 0, numofDes = 0, numofPro = 0;
        for (int i = 0; i < total; i++) {

            if (team[i] instanceof Architect) {
                numofArch++;
            } else if (team[i] instanceof Designer) {
                numofDes++;
            } else if (team[i] instanceof Programmer) {
                numofPro++;
            }
        }

        if (p instanceof Architect) {
            if (numofArch >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (numofDes >= 2)
                throw new TeamException("团队中至多只能有两名设计师");
        } else if (p instanceof Programmer) {
            if (numofPro >= 3)
                throw new TeamException("团队中至多只能有三名程序员");

        }

        // 将(p/e)添加到team里
        team[total++] = p;
        // p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
    }

    /**
     * @description: 判断指定的员工是否已经存在于现有的开发团队中
     * @param {*}
     * @return {*}
     */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {//别错写成team[i].getMember() == e.getId()
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        // 未找到memberId的情况
        if (i == total) {
            throw new TeamException("找不到指定的memberId的员工,删除失败");
        }
        for (int j = i; j < total - 1; j++) {
            team[j] = team[j + 1];
        }
        team[--total] = null;
    }
}
