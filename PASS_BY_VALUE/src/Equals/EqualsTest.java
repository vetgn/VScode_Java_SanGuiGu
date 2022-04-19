package src.Equals;

/**
 * 一、回顾 == 的使用：
 * == ： 运算符
 * 1.可以使用在基本数据类型变量和引用数据类型变量中
 * 2.如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等(不一定类型要相同)
 * 如果比较的是引用数据类型变量：比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
 * 
 * 二、equals()方法的使用：
 * 1.是一个方法，而非运算符
 * 2.只能适用于引用数据类型
 * 3.Object类中equals()的定义：
 * public boolean equals(Object obj) {
 * return (this == obj);
 * }
 * 说明：Object类中定义的equals()和==的作用是相同的，比较两个对象的地址值是否相同，
 * 即两个引用是否指向同一个对象实体
 * 
 * 4.像String、Date、File、包装类等都重写了Object类中的equals()方法，重写以后，比较的不是
 * 两个引用的地址是否相同，而是比较两个对象的“实体内容”是否相同
 * 
 * 5.通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的“实体内容”是否相同，那么，我们
 * 就需要对Object类中的equals()进行重写
 */
public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;
        char c = 10;
        System.out.println(i == j);// true
        System.out.println(i == d);// true
        System.out.println(i == c);// true
        /*
         * boolean i1 = true;
         * System.out.println(i1 == i);
         * 是不行的，不带boolean玩
         */
        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);// true
        System.out.println("************");
        //引用类型
        Customer cust1 = new Customer("TOM", 20);// 地址为 cust1 = Customer@14
        Customer cust2 = new Customer("TOM", 20);// 地址为 cust2 = Customer@16
        System.out.println(cust1 == cust2);// false,二者的地址不相同

        String str1 = new String("ZJJ");
        String str2 = new String("ZJJ");
        System.out.println(str1 == str2);// false
        System.out.println("************");
        // equals()的使用
        System.out.println(cust1.equals(cust2));// false用的java.lang.Object.equals
        System.out.println(str1.equals(str2));// true用的java.lang.String.equals重写了Object里的方法
        /* System.out.println(cust1.equals(str2));
        System.out.println(str2.equals(cust1)); 
        二者都是false 不是同一个引用类型，就不会相同*/
    }
}
