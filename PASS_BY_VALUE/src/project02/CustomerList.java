package src.project02;

/**
 * CustomerList为Customer对象的管理模块，内部数组管理一组Customer对象，并提供相应的添加、修改、
 * 删除和遍历方法，供CustomerView调用
 */
public class CustomerList {
    private  Customer[] customers;
    private  int total;// 记录已保存客户对象的数量

    /**
     * 用来初始化customer数组的构造器
     * 
     * @param totalCustomer:指定数组的长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 将指定的数组添加到数组中
     * 
     * @param customer
     * @return true：返回成功 false：返回失败
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    /**
     * 修改指定位置上的索引信息
     * 
     * @param index
     * @param cust
     * @return true:修改成功 false：返回失败
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定位置上的索引信息
     * 
     * @param index
     * @return true:修改成功 false：返回失败
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }

        // 最后有数据的元素要删除！
        customers[--total] = null;

        return true;
    }

    /**
     * 获取所有客户的信息
     * 
     * @return
     */
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定位置上的索引信息
     * 
     * @param index
     * @return 如果找到了元素则返回，没找到则返回null
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }

        return customers[index];
    }

    /**
     * 获取客户的数量
     * 
     * @return
     */
    public int getTotal() {
        return total;
    }
}
