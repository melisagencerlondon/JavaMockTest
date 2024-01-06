package Java.class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone Samsung=new Phone();
        Samsung.model="S23";
        Samsung.brand="Samsung";
        double price=20000;
        Samsung.color="Black";
        Samsung.takepic();


        System.out.println(Samsung.model);
        System.out.println(Samsung.brand);
        System.out.println(Samsung.price);
        System.out.println(Samsung.color);
        Samsung.takepic();
        Samsung.call();
        Samsung.playgame();

    }
}
