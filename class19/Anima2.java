package Java.class19;

public class Anima2 {
    public class Animal2 {
        private String name;
        private String color;
        private int age;
        private double weight;

        public Animal2(String name, String color, int age, double weight) {
            this.name = name;
            this.color = color;
            this.age = age;
            this.weight = weight;
        }

        public void printInfo() {
            System.out.println(name + " " + color + " " + age + " " + weight);
        }
    }

    class Dog extends Java.class19.Animal {


        public Dog(String name, String color, int age, double weight) {
            super(name, color, age, weight);
        }

        public void bark() {
            System.out.println("Wuff Wuff");
        }

    }

    class Cat extends Java.class19.Animal {

        public Cat(String name, String color, int age, double weight) {
            super(name, color, age, weight);
        }

        public void meow() {
            System.out.println("Meow meow.....");
        }

    }
}
