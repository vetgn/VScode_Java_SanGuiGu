/* 可变个数的形参
    1.格式：数据类型...变量名
    2.当调用可变个数形参的方法时，传入的参数个数可以是：0个 1个 2个等等
    3.可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
    4.可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。即，二者不能共存。
    5.可变个数形参在方法的形参中，必须声明在末尾
    6.可变个数形参在方法的形参中，最多只能声明一个可变形参
    */

public class three {

    public static void main(String[] args) {
        three text = new three();
        text.show(1);
        text.show("Hello");// 这个指定了准确的参数，因此指定的是第二个函数
        text.show("Hello", "Word");
        text.show();
        text.show("AA", "BB", "CC");
        text.show(new String[] { "AA", "BB", "CC" });// 这样也不会报错

    }

    public void show(int i) {
        System.out.println(i);
    }

    public void show(String s) {
        System.out.println(s);
    }

    public void show(String... s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    /*
     * public void show(String[] s) {
     * System.out.println(s); 这与上面是不能共存的
     * }
     */
}
