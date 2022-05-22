/*
 * @Author: vetgn
 * @Date: 2022-05-22 13:40:55
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-22 13:55:02
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Homework12\Three\Doctor.java
 * @Description: 
 * 
 */
package src.Homework12.Three;

public class Doctor extends Adult implements IActivity {
    private String specialty;
    private double salary;
    private String hospitalName;

    public Doctor() {

    }

    public Doctor(String name, String sex, int age, boolean marriage, String address) {
        super(name, sex, age, marriage, address);
    }

    public Doctor(String name, String sex, int age, boolean marriage, String address, String specialty, double salary,
            String hospitalName) {
        super(name, sex, age, marriage, address);
        this.specialty = specialty;
        this.salary = salary;
        this.hospitalName = hospitalName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String working() {
        return super.getName() + "正在给人看病!";
    }

    @Override
    public String toString() {
        return "姓名：" + getName() + "，性别：" + getSex() + "，年龄：" + getAge()
                + "，婚姻：" + isMarriage() + "，住址：" + getAddress();
    }
}
