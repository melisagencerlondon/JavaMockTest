package Java.class7;

public class T7 {
    //Create an array on integers and calculate the sum of all elements in an array
    //From an array of integer elements find the largest number.
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 45, 69, 55, 45, 69, 20};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 55) {
                System.out.println("found");
                break;
            }
        }
    }
}


