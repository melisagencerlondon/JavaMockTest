package Java.class15;


public class Teacher {
    //Write a Teacher class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  Teacher using displayInfo method.
    private String name;
    private  String address;

    private int age;
    private double weight;



    public Teacher(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Teacher(String name, String address, int age, double weight) {
        this(name, address, age);
        this.weight = weight;
    }





    void printInfo(){
        System.out.println(name+" "+address);
    }
}
