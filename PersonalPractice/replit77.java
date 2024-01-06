package Java.PersonalPractice;

import java.util.Scanner;

public class replit77 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = scanner.next();
        scanner.close();
        String str2 = str.length() >= 3 ? str.substring(0, 3) : str;
        System.out.println("The first 3 letters of " + str + " is " + str2);
    }
}
