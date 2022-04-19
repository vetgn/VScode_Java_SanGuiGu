/*
 * @Author: vetgn
 * @Date: 2022-04-08 11:55:49
 * @LastEditors: vetgn
 * @LastEditTime: 2022-04-08 15:52:43
 * @FilePath: \Project_3\src\team_service\NameListServiceTest.java
 * @Description: 对NameListService类的测试
 * 
 */
package team_service;

import org.junit.Test;

import team_domain.Employee;

public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployees() {
        NameListService service = new NameListService();
        int id = 1;
        try {
            System.out.println(service.getEmployee(id));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
