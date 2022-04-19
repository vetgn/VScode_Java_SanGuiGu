package src.Book2;
import java.util.Arrays;
/**
 * 将一个数组里的元素倒序
 */
public class fourteen {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9};
        int[] array01 = new int[array.length];
        int i=0;
        int j=array.length-1;
        while(j>-1){
            array01[j] = array[i];
            i++;
            j--;
        }
        System.out.print(Arrays.toString(array01));
    }
}
