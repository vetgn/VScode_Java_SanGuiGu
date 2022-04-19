/*
 * @Author: vetgn
 * @Date: 2022-04-08 09:57:34
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-09 21:59:29
 * @FilePath: \Project_3\src\team_service\NameListService.java
 * @Description: 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法
 * 
 */
package team_service;

import team_domain.Architect;
import team_domain.Designer;
import team_domain.Employee;
import team_domain.Programmer;

import static team_service.Data.*;

import team_domain.Equipment;
import team_domain.NoteBook;
import team_domain.PC;
import team_domain.Printer;

public class NameListService {
    private Employee[] employees;

    /**
     * 给employee及数组元素进行初始化
     */
    public NameListService() {
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            // 获取员工的类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            // 获取Employee的4个基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            int salary = Integer.parseInt(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;

            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    /**
     * @description: 获取指定index上的员工位置
     * @param {index}
     * @return
     */
    public Equipment createEquipment(int index) {
        // 识别是PC 21、NOTEBOOK 22、PRINTER 23
        int key = Integer.parseInt(EQUIPMENTS[index][0]);

        String model = EQUIPMENTS[index][1];
        switch (key) {
            case PC:
                String display = EQUIPMENTS[index][2];
                return new PC(model, display);
            case NOTEBOOK:
                int price = Integer.parseInt(EQUIPMENTS[index][2]);
                return new NoteBook(model, price);
            case PRINTER:
                String type = EQUIPMENTS[index][1];
                String name = EQUIPMENTS[index][2];
                return new Printer(type, name);
        }
        return null;
    }

    /**
     * @description: 获取当前所有员工
     * @return
     */
    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     * @description: 获取指定ID的员工对象
     * @param {int} id
     * @return {*}
     * @throws TeamException
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工");
    }
}