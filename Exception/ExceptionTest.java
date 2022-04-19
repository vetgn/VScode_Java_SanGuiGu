import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.io.File;

import org.junit.Test;

/**
 * 一、异常体系结构
 * 
 * java.lang.Throwable
 *      |------java.lang.Error:一般不编写针对性的代码进行处理
 *      |------java.lang.Exception:可以进行异常的处理
 *          |------编译时异常(checked)
 *                   |------IOException
 *                       |----------FileNotFoundException
 *                   |------ClassNotFoundException
 *          |------运行时异常(unchecked, RuntimeException)
 *                   |------NullPointerException
 *                   |------ArrayIndexOutOfBoundsException
 *                   |------ClassCastException
 *                   |------NumberFormatException
 *                   |------InputMismatchException
 *                   |------ArithmeticException 

 */
public class ExceptionTest {
    /*********以下是编译时时异常 *************/
    @Test
    public void test7(){
        
           try {
            File file = new File("hello,txt");
            FileInputStream fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1) {
                System.out.println((char) data);
                data = fis.read();
            }

            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /********* 以下是运行时异常 **************/
    // NullPointerException
    @Test
    public void test1() {
        int[] arr = null;
        System.out.println(arr[3]);
    }

    // IndexOutOfBoundsException
    @Test
    public void test2() {
        // ArrayIndexOutOfBoundsException
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    // ClassCastException
    @Test
    public void test3() {
        Object obj = new Date();
        String str = (String) obj;
    }

    // NumberFormatException
    @Test
    public void test4() {
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }

    // InputMismatchException
    @Test
    public void test5() {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        System.out.println(score);
    }

    // ArithmeticException
    @Test
    public void test6() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }
}
