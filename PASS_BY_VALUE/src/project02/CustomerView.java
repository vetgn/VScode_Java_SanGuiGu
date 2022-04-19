package src.project02;

import java.util.Scanner;

/**
 * CustomerView为主模块，负责菜单的显示和用户操作
 * 
 */
public class CustomerView {

    private CustomerList customerList = new CustomerList(10);

    Scanner scan = new Scanner(System.in);

    public CustomerView() {
        Customer customer = new Customer("张三", '男', 25, "12345678910", "@qq.com");
        customerList.addCustomer(customer);
    }

    /**
     * 显示目录的操作
     */
    public void enterMainMenu() {

        System.out.println("----------客户信息管理软件----------");
        System.out.println("          1.添加客户");
        System.out.println("          2.修改客户");
        System.out.println("          3.删除客户");
        System.out.println("          4.客户列表");
        System.out.println("          5.退   出");
        System.out.print("          请选择(1-5)：");
        char menu = scan.next().charAt(0);

        if (menu < '1' || menu > '5') {
            System.out.println("输入错误！");
            enterMainMenu();
        }
        switch (menu) {
            case '1':
                addNewCustomer();
                break;
            case '2':
                modifyCustomer();
                break;
            case '3':
                deleteCustomer();
                break;
            case '4':
                ListAllCustomers();
                break;
            case '5':
                System.out.print("是否确认退出？(Y/N):");
                char menu01 = scan.next().charAt(0);
                if (menu01 == 'Y') {
                    break;
                } else if (menu01 == 'N') {
                    enterMainMenu();
                } else {
                    System.out.println("输入错误，请重新输入");
                    enterMainMenu();
                }
        }
    }

    /**
     * 添加客户的操作
     */
    private void addNewCustomer() {
        /* System.out.println("添加客户"); */
        Customer c = new Customer();
        System.out.println("-----------添加客户-----------");
        // 输入姓名
        System.out.print("姓名:");
        String name = scan.next();
        c.setName(name);

        // 输入性别
        System.out.print("姓别:");
        char gender = scan.next().charAt(0);
        c.setGender(gender);

        // 输入年龄
        System.out.print("年龄:");
        int age = scan.nextInt();
        c.setAge(age);

        // 电话
        System.out.print("电话:");
        String phone = scan.next();
        c.setPhone(phone);

        // 输入邮箱
        System.out.print("邮箱:");
        String email = scan.next();
        c.setEmail(email);

        // 封装到用户信息中
        Customer customer = new Customer(name, gender, age, phone, email);
        boolean b = customerList.addCustomer(customer);// 添加到用户信息中
        if (b) {
            System.out.println("-----------添加完成----------");
        } else {
            System.out.println("-----------添加失败----------");
        }
        System.out.println();
        System.out.println();

        this.enterMainMenu();
    }

    /**
     * 修改客户的操作
     */
    private void modifyCustomer() {
        /* System.out.println("修改客户"); */
        System.out.println("-----------修改客户-----------");
        System.out.print("请输入客户的编号(-1退出):");
        for (;;) {
            int number = scan.nextInt();// 输入客户的数字
            if (number == -1) {
                break;
            } else if (number >= 1 && number <= customerList.getTotal()) {
                Customer cust = customerList.getCustomer(number - 1);
                // 重新输入姓名
                System.out.print("姓名(" + cust.getName() + "):");
                String name = scan.next();
                cust.setName(name);
                // 重新输入性别
                System.out.print("姓别(" + cust.getGender() + "):");
                char gender = scan.next().charAt(0);
                cust.setGender(gender);
                // 重新输入年龄
                System.out.print("年龄(" + cust.getAge() + "):");
                int age = scan.nextInt();
                cust.setAge(age);
                // 重新输入电话号码
                System.out.print("电话号码(" + cust.getPhone() + "):");
                String phone = scan.next();
                cust.setPhone(phone);
                // 重新输入邮箱
                System.out.print("邮箱(" + cust.getEmail() + "):");
                String email = scan.next();
                cust.setEmail(email);
                // 已经在客户的信息中，不用封装
                System.out.println("-----------添加完成----------");

                System.out.println();
                System.out.println();

                this.enterMainMenu();

            }
        }
    }

    /**
     * 删除客户的操作
     */
    private void deleteCustomer() {
        /* System.out.println("删除客户"); */
        System.out.print("请输入要删除的客户的编号(-1退出)：");
        int number = scan.nextInt();
        for (;;) {
            if (number == -1) {
                break;
            } else if (number >= 1 && number <= customerList.getTotal()) {
                customerList.deleteCustomer(number - 1);
                System.out.println();
                System.out.println();

                this.enterMainMenu();
            }

        }
    }

    /**
     * 显示客户列表的操作
     */
    private void ListAllCustomers() {
        /* System.out.println("客户列表"); */
        System.out.println("-----------客户列表-----------");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户信息!");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
                System.out.println(
                        (i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge() + "\t" +
                                cust.getPhone() + "\t" + cust.getEmail());
            }
        }

        System.out.println("---------客户列表完成---------");
        System.out.println();
        System.out.println();

        this.enterMainMenu();

    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
