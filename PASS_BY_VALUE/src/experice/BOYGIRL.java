package src.experice;

//this练习

public class BOYGIRL {
    public static void main(String[] args) {
        Boy boy = new Boy("小明", 22);
        boy.shout();
        Girl girl = new Girl("小丽", 18);
        boy.marry(girl);

        System.out.println("**************");

        girl.marry(boy);

        System.out.println("**************");

        Girl girl1 = new Girl("小朱", 18);
        int compare = girl.compare(girl1);
        if (compare > 0) {
            System.out.println(girl.getName() + "大");
        } else if (compare < 0) {
            System.out.println(girl1.getName() + "大");
        } else
            System.out.println(girl1.getName() + "和" + girl.getName() + "一样大");

    }
}
