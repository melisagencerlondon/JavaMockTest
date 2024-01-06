package Java.class16;

public class AnimalTest {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="Jacky";
        d.age=10;
        d.weight=20;
        d.color="white";
        d.printInfo();
        d.bark();
        Cat c=new Cat();
        c.name="lulu";
        c.age=8;
        c.weight=32;
        c.color="black";
        c.sleep();
        c.printInfo();
    }
}
