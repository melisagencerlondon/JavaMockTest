package Java.class22;

public class CalculatorTester {
    public static void main(String[] args) {
        //we cant create the object of interfaces like:
        //Calculator m=new Math(); or
        //Calculator c=new Calculator();
        Math m=new Math();
        int r=m.add(10,10);
        System.out.println(r);
    }
}
