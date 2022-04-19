import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理的方式二：throws + 异常类型
 * 
 * 1. "throws + 异常类型" 写在方法的声明处。指明此方法执行时，可能会抛出的异常类型
 *      一旦当方法体执行时，出现异常，仍然会在异常代码处生成一个异常类的对象，此对象满足throws后异常类型时，
 *      就会被抛出.异常代码后续的代码，就不会再执行!
 * 
 * 2.体会：try-catch-finally：真正的将异常给处理掉了
 *          throws的方式只是将异常抛给了方法的调用者，并没有真正的将异常处理掉。
 */
public class ExceptionTest2 {

    public static void main(String[] args) {
        //可以抛到这里来解决
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        //也可以通过调用方法3进行处理异常
        //method3();
    }

    public static void method3(){
        try {
            method2();
        } catch (IOException e ) {
            e.printStackTrace();
        } 
    }

    public static void method2() throws IOException{//由于IOException是FileNotFoundException的父类，可以处理
        method1();
    }

    public static void method1()throws FileNotFoundException,IOException{//将异常抛给上面的方法
        File file = new File("hello,txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fis.read();
        }

        fis.close();
        System.out.println("hahahahah");
    }
}
