//匿名对象的使用
//1.理解：我们创建的对象，没有显示的赋给一个变量名。即为匿名对象
//2.特征：
//3.使用：
public class instance {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);

        p.sendEmail();
        p.playgame();
        //******************************

        //特征

        /*
           new Phone().sendEmail();
           new Phone().playgame();
         */

        new Phone().price = 1999;
        new Phone().showPrice();// 输出0.0

        //******************************
        //使用
        System.out.println("************************");
        PhoneMall mall = new PhoneMall();
       /*  mall.show(p); */
       mall.show(new Phone());
        System.out.println("************************");

    }
}

class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playgame();
    }
}

class Phone {
    double price;// 价格

    public void sendEmail() {
        System.out.println("发送文件");
    }

    public void playgame() {
        System.out.println("玩游戏");

    }

    public void showPrice() {
        System.out.println("手机价格为" + price);

    }
}
