package src.Equals;

public class Customer {
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 重写是因为想要让Object里的比较地址值的变成比较“实体内容”
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Customer) {
            Customer cust = (Customer) obj;
            // 比较两个对象的每个属性是否都相同
            // 为什么用this.name.equals(cust.name),因为我们想要比较的是两个对象的“实体内容”是否相同
            // 那么运用java.lang.String.equals，就可以实现这个效果
            // 如果我运用 == 那么它比较的是引用数据类型的地址值，而不是“实体内容”
            if (this.age == cust.age && this.name.equals(cust.name)) {
                return true;
            } else {
                return false;
            }
            // 或 return this.age == cust.age && this.name.equals(cust.name);
        }
        return false;
    }

}
