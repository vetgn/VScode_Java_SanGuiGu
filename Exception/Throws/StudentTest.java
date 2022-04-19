package Throws;

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s = new Student();
            s.regist(-1001);
            System.out.println(s);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class Student{
    private int id;

    public void regist(int id) throws Exception{
        if(id > 0) {
            this.id = id;
        }else {
            //System.out.println("你输入的数据违法!");

            //手动抛出异常对象
            //throw new RuntimeException("你输入的数据违法!");

            //自定义异常类
            throw new MyException("输入的是负数");
        }
    }

}
