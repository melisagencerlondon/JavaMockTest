package Java.class4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask if the user has a credit card
        System.out.print("Do you have a credit card? (yes/no): ");
        String hasCreditCard = scanner.nextLine();

        if (hasCreditCard.equals("yes")) {
            // If the user has a credit card, ask for the balance
            System.out.print("What is the balance on your credit card?: ");
            double balance = scanner.nextDouble();

            if (balance > 1000) {
                System.out.println("Your credit card balance is larger than $1000. Please pay it off immediately.");
            } else {
                System.out.println("You can spend more on your credit card.");
            }
        } else if (hasCreditCard.equals("no")) {
            // If the user does not have a credit card, offer them one
            System.out.println("You don't have a credit card. Would you like to apply for one?");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }

    }
}