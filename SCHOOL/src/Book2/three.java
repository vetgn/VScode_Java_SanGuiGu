package src.Book2;

public class three {
    public static void main(String[] args) {

        int i, j, k;
        int x, y, z;
        int a, b, c;
        int total = 0;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                if (j != i) {
                    for (k = 1; k <= 9; k++) {
                        if (k != i && k != j) {
                            //
                            for (x = 1; x <= 9; x++) {
                                if (x != i && x != j && x != k) {
                                    for (y = 1; y <= 9; y++) {
                                        if (y != i && y != j && y != k && y != x) {
                                            for (z = 1; z <= 9; z++) {
                                                if (z != i && z != j && z != k && z != x && z != y) {
                                                    //
                                                    for (a = 1; a <= 9; a++) {
                                                        if (a != i && a != j && a != k && a != x && a != y && a != z) {
                                                            for (b = 1; b <= 9; b++) {
                                                                if (b != i && b != j && b != k && b != x && b != y
                                                                        && b != z && b != a) {
                                                                    for (c = 1; c <= 9; c++) {
                                                                        if (c != i && c != j && c != k && c != x
                                                                                && c != y
                                                                                && c != z && c != a && c != b) {
                                                                            if ((i * 100 + j * 10 + k)
                                                                                    + (x * 100 + y * 10 + z) == (a * 100
                                                                                            + b * 10 + c)) {
                                                                                total++;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("有" + total / 2 + "个组合");
    }
}
