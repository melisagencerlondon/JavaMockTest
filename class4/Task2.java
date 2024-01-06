package Java.class4;

public class Task2 {
    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 300;
        int num3 = 100;
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Num1 is largest number  " + num1);
            }
        } else {
            if (num2 > num3) {
                System.out.println("Num2 is largest number " + num2);
            } else {
                System.out.println("Num3 is largest " + num3);
            }
        }

    }
}

