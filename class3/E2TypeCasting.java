package Java.class3;

public class E2TypeCasting {
    public static void main(String[] args) {
        double price=12.3;
        double quantity=3;
        double totalPrice=price*quantity;
        System.out.println(totalPrice);
        System.out.println((int)totalPrice);
        //losing data, it is dropping not rounding down

        }
    }

