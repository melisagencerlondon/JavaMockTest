package Java.class21;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c = new Cat("Meno", "Black");
        c.eat();
        c.speak();
        c.sleep();
        Animal c2 = new Cat("meno", "Black");
        Animal c3 = new Dog("Mane", "Black");
        c2.printInfo();
        Animal[] arr = {new Cat("mane", "Black"), new Dog("mane", "Black")};
        for (Animal a : arr) {
            a.eat();
            a.speak();
            a.sleep();
        }
    }
        }

