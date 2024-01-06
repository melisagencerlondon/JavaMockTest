package Java.class13;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        T2 evodd = new T2();
        evodd.evenOrOdd();
    }

    void evenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else
            System.out.println("Number is odd");
    }
}