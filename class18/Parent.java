package Java.class18;

public class Parent {
    void marry() {
        System.out.println("Marry the girl that we have selected for you");
    }
}class Karimi extends Parent {
    void marry(){
        System.out.println("I want to marry Scarett Johnanson");
    }


    public void sleep() {
    }
}
    class Tester{
        public static void main(String[] args) {
            Karimi k=new Karimi();
            k.marry();
            k.sleep();

        }
    }

