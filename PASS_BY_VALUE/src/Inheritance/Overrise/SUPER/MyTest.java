package src.Inheritance.Overrise.SUPER;

    public class MyTest {
	
        public static void main(String[] args) {
            new Cat(); 
        }
    }
    
    //父类，Animal类
    class Animal {
        //构造函数
        public Animal() {
            super();
            System.out.println("1：Animal类的无参数构造函数执行");
        }
        public Animal(int i) {
            super();
            System.out.println("2：Animal类的有int参数构造函数执行");
        }
    }
    
    //子类，Cat类
    class Cat extends Animal{
        //构造函数
        public Cat() {
            this("");
            System.out.println("3：Cat类的无参数构造函数执行");
        }
        public Cat(String str) {
            super(5);
            System.out.println("4：Cat类的有String参数构造函数执行");
        }
    }
