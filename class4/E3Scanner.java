package Java.class4;


import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your age ");
        /*
        Scanner is dytatype
        scan is a variable
        new is a keyword tht we use to creat objects
        (System.in) means we want to read from keyboard */
        Scanner scan=new Scanner(System.in);
        //scan.nextInt() take the int number from the
        //keyboard and store it inside age variable
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old");


    }
}
