public class one {
    public static void main(String[] args) {
        Student[] stus = new Student[20];
        // 给Sudent赋值
        for (int i = 0; i < 20; i++) {
            stus[i] = new Student();
        }

        // 学号
        for (int i = 0; i < 20; i++) {
            stus[i].number = i + 1;
            // 年级[1,6]
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            // 成绩[0,100]
            stus[i].score = (int) (Math.random() * (100 - 0 + 1) + 0);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(stus[i].info());
        }
        System.out.println("问题一");
        // 问题一
        for (int i = 0; i < 20; i++) {
            if (stus[i].state == 3) {
                System.out.println(stus[i].info());
            }
        }
        System.out.println("问题二");
        // 问题二
        int m, n, temp;
        for (m = 0; m < 20 - 1; m++) {
            for (n = 0; n < 20 - m - 1; n++) {
                if (stus[n].score > stus[n + 1].score) {
                    temp = stus[n].score;
                    stus[n].score = stus[n + 1].score;
                    stus[n + 1].score = temp;
                }
            }
        }
        for (m = 0; m < 20; m++) {
            System.out.println(stus[m].info());
        }

    }
}

class Student {
    int number;// 学号
    int state;// 年级
    int score;// 成绩
/**
 * 输出学号
 * @return
 */
    public String info() {
        return ("学号为" + number + "  " + "年级为" + state + "  " + "成绩为" + score);
    }
}
