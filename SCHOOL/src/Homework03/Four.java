package src.Homework03;

/**
 * 下表显示了3个学生4门课程的成绩，定义一个二维数组，计算每个学生的平均分并输出它们
 * 课程学号 数学 计算机基础 大学英语
 *    0     62      59      82
 *    1     76      86      68
 *    2     58      71      79
 *    3     45      67      76
 * 
 */
public class Four {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 0, 62, 59, 82 }, { 1, 76, 86, 68 }, { 2, 58, 71, 79 }, { 3, 45, 67, 76 } };
        Four.averscore(arr);//调用函数
    }

    public static void averscore(int[][] arr) {
        double aver;//平均值
        for (int i = 0; i < arr.length; i++) {
            double sum = 0;//分数的总和，并且每次循环进行初始化
            for (int j = 1; j < 4; j++) {
                sum += arr[i][j];
            }
            aver = sum / 4.0;
            System.out.println("课程学号为" + i + "的同学的课程平均分为：" + aver);
        }
    }
}
