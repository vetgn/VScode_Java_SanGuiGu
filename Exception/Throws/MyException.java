package Throws;
/**
 * 如何自定义异常类？
 *  1.继承于现有的异常结构：RuntimeException（这个不需要处理）、Exception（这个就需要进行处理一下）
 *  2.提供全局常量:serialVersionUID
 *  3.提供重载的构造器
 */
public class MyException extends Exception{
    static final long serialVersionUID = -7034897190745766939L;

    public MyException(){

    }

    public MyException(String msg){
        super(msg);
    }
}
