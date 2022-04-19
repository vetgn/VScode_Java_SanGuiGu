package src.project01;

/*
    递归方法的使用
    1.递归方法：一个方法体内调用它自身。
    2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无需循环控制。
    递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。

*/
public class RecursionTest {
    public static void main(String[] args) {
        // 1.计算1~100內所有自然数的和
        System.out.print("计算1~100內所有自然数的和\t");
        // 方式一：
        /*
         * int sum = 0;
         * for (int i = 0; i <= 100; i++) {
         * sum = sum + i;
         * }
         */
        RecursionTest s = new RecursionTest();
        int area = s.Sum(3);
        System.out.println(area);
        System.out.print("计算1~100內所有自然数的乘积\t");
        System.out.println(s.project(3));

    }

    // 方式二：
    // 递归
    public int Sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + Sum(n - 1);
        }
    }

    public int project(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * project(n - 1);
        }
    }
}
