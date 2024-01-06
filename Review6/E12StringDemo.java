package Java.Review6;

public class E12StringDemo {
    public static void main(String[] args) {
        String str="My name is James my number is 8992000";
        String number=str.replaceAll("[^0-9]","");
        System.out.println(number);
        StringBuilder stringBuilder=new StringBuilder("Java");
        System.out.println(stringBuilder);

    }
}
