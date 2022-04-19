import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

import org.junit.Test;

/* 异常的处理:抓抛模型

    过程一: "抛":程序在正常执行的过程中,一旦出现异常,就会在异常代码处生成一个对应异常类的对象。
            并将此对象抛出。
            一旦抛出对象以后,其后的代码就不再执行。

            关于异常对象的产生：① 系统自动生成的异常对象
                              ② 手动的生成一个异常对象，并抛出(throw)
            
    过程二: “抓":可以理解为异常的处理方式: ① try-catch-finally ② throws 

二、try-catch-finally的使用

try{
    //可能出现的代码
}catch(异常类型1 变量名1){
    //处理异常的方式1
}catch(异常类型2 变量名2){
    //处理异常的方式2
}catch(异常类型3 变量名3){
    //处理异常的方式3
}
....
finally{
    //一定会执行的代码
}


说明：
    1.finally是可选的
    2.使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，根据此对象
        的类型。去catch中进行匹配
    3。一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。一旦处理完成，就跳出当前的
        try-catch结构(在没有写finally的情况)，继续执行其后的代码
    4.catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓
          catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类的上面。否则，报错
    5.常用的异常对象处理的方式：① String getMessage()       ②printStackTrace()
        .在try中声明的变量，出了try就不能再使用
    7.try-catch-finally是可以嵌套的



体会1：使用try-catch-finally处理编译时异常，使得程序在编译时就不在报错，但是运行时仍然可能报错
        相当于我们使用try-catch-finally将一个编译可能出现的异常，延迟到运行时出现
体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally了。
        针对与编译时异常，我们说一定要考虑异常的处理

3.开发中如何选择使用try-catch-finally 还是使用throws？
    3.1 如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws，意味着如果
        子类重写的方法有异常，必须使用try-catch-finally方式处理
    3.2 执行的方法a中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。我们建议这几个方法使用throws的
        方式进行处理。而执行的方法a可以考虑使用try-catch-finally方式进行处理。
*/
public class ExceptionTest1 {

    private String message;

    @Test
    public void test1() {
        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);

            System.out.println("hello-----------1");
        } catch (NumberFormatException e) {
            // 自己定义出现异常输出的语句
            // System.out.println("数字转换异常");

            // 方式一 String getMessage
            // message = e.getMessage();
            // System.out.println(message);

            // 方式二 .printStackTrace
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("异常");
        }
        System.out.println("hello------2");

    }
    @Test
    public void test2() throws IOException {

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
        }
    }
}
