package Java.class7;

public class E13Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 45, 69, 55, 45, 69, 20};
        //search for number 55 if present print found

        for (int i=0; i<numbers.length;i++) {

            if (numbers[i] == 55) {
                System.out.println("found");
                break;


            }
        }
    }}
