package src.Homework03;

/**
 * 2．将一个数组中的重复元素保留一个其他的清零。（知识点：数组遍历、数组元素访问）
 */
public class Two {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 1, 2, 3, 3, 3, 6 };// 创建一个数组
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    array[j] = 0;// 将数组中元素进行比较，元素相同并且下标不同
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)// 输出不是0的数
                System.out.print(array[i] + "   ");
        }
    }
}
