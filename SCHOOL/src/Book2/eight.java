package src.Book2;

public class eight {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
        }
    }
}
