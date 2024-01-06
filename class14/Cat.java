package Java.class14;

public class Cat {
    //istance variable
    String name="kitty";

    void printName(){
        //local variable
        //String name="Kunkus";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.printName();
    }
}
