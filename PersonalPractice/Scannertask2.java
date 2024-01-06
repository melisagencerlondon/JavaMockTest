package Java.PersonalPractice;

import java.util.Scanner;

public class Scannertask2 {
    public static void main(String[] args) {
        //Create a Java program that will ask if user has a credit card or not.
        // If you user does not have a credit card then offer them.
        // If they do have one ask what is balance on the card?
        // If balance of the card is larger than 1000, tell them to pay off immediately,
        // otherwise you can tell them that they can spend more.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a credit card Yes/No");
        String hasCreditCard=scanner.nextLine();
        if (hasCreditCard.equals("No")){
            System.out.println("Would you like to have one? ");
        }else if (hasCreditCard.equals("yes")){
            System.out.println("What is balance of your credit card ");
        } double balance= scanner.nextDouble();
        if (balance > 1000){
            System.out.println("Pay balance immediately");
        }
        else{
            System.out.println("You can spend more");
        }




    }
}
