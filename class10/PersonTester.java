package Java.class10;

public class PersonTester {
    public static void main(String[] args) {
        person p1=new person();
        p1.name="Ella";
        p1.weight=100;
        p1.gender='F';
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.weight);
        System.out.println(p1.gender);
        p1.eat();
        p1.sleep();

    }
}
