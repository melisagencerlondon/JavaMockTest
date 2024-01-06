package Java.class15;

public class Dog {//we made it private so
    // they are only accessible in class
    //and prevent unwanted editing
    private String name;//we are restricting other to put rubish
    // in our code with this if else cond.

    private String breed;
    private String color;
    private int age;

    public Dog(String dName, String dBreed, String dColor, int daAge) {//from this to void part is contructor
        name = dName;
        breed = dBreed;
        color = dColor;
        //age=daAge;
        if (age < 30) {
            age = daAge;
        } else {
            System.out.println("wrong age");
        }

    }

    void printInfo() {//printInfo is a method
 System.out.println(name + " " + breed + " " + color + " " + age);
    }
}
