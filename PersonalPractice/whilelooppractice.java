package Java.PersonalPractice;

import java.util.Scanner;

public class whilelooppractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.println("enter your name");
            name = scanner.nextLine();
        } while (name.isBlank());
        System.out.println("hello " + name);
    }
}
