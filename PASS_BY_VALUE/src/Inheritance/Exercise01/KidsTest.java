package src.Inheritance.Exercise01;

public class KidsTest {
    public static void main(String[] args){
        Kids someKid = new Kids(20);
        someKid.setSex(1);
        someKid.manOrWoman();

        someKid.setSalary(0);;
        someKid.employeed();

        someKid.printAge();
    }
}
