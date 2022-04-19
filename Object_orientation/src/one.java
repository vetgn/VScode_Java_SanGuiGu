package src;

public class one {
    public static void main(String[] args) {
        one a = new one();// 在调用method函数的时候，要声明
        int area = a.method(2, 2);// 这样输出的时候就不仅会打印图形，还会输出数字
        System.out.println("面积是" + area);
    }

    public int method(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return (m * n);
    }
}
