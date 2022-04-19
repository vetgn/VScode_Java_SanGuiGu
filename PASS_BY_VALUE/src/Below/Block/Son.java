package src.Below.Block;

//P332
class Father {
    static {
        System.out.println("1111111111");
    }
    {
        System.out.println("2222222222");
    }

    public Father() {
        System.out.println("3333333333");
    }
}

public class Son extends Father {
    static {
        System.out.println("4444444444");
    }
    {
        System.out.println("5555555555");
    }

    public Son() {
        System.out.println("6666666666");
    }

    public static void main(String[] args) {// main也只是一个方法
        System.out.println("7777777777");
        System.out.println("****************************");
        new Son();
        System.out.println("****************************");

        new Son();
        System.out.println("****************************");
        new Father();

    }
}
// 1111111111
// 4444444444
// 7777777777
// ****************************
// 2222222222
// 3333333333
// 5555555555
// 6666666666
// ****************************
// 2222222222
// 3333333333
// 5555555555
// 6666666666
// ****************************
// 2222222222
// 3333333333