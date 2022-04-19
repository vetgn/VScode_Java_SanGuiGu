package src.Polymorphism.Introduction;

//多态性使用的举例一
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.fun(new Dog());// Animal animal = new Dog();
        animalTest.fun(new Cat());// Animal animal = new Cat();
    }

    public void fun(Animal animal) {
        animal.eat();
        animal.shout();
    }
    // 就不用来写这些，很麻烦
    /*
     * public void fun1(Dog dog) {
     * dog.eat();
     * dog.shout();
     * }
     * 
     * public void fun1(Cat cat) {
     * cat.eat();
     * cat.shout();
     * }
     */

}

class Animal {

    public void eat() {
        System.out.println("动物，进食");
    }

    public void shout() {
        System.out.println("动物，叫");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void shout() {
        System.out.println("汪");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void shout() {
        System.out.println("喵");
    }
}
