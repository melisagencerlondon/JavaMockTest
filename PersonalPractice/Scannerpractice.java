package Java.PersonalPractice;

import java.util.Scanner;

public class Scannerpractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your name ");
        String name=scan.next();
        System.out.println(name);
        System.out.println("What's your age ");
        int age =scan.nextInt();
        System.out.println("What's your fav. quote");
        String quote=scan.next();
        quote+=scan.nextLine();
        System.out.println("Thank you "+name+" you are "+age+" years old"+" your fav quote is "+ quote);

    }
}
