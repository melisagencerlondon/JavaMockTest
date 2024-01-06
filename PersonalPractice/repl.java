package Java.PersonalPractice;

import java.util.Scanner;

public class repl {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
            System.out.println("Do you need a loan?");
            boolean loan = sc.nextBoolean();
            System.out.println("What is your credit score?");
            System.out.println("Unknown");
            int score = sc.nextInt();
            if(loan==true&&loan&&score < 600){
                System.out.println("The eligibility is Not eligible");}
            else if(loan&&score >= 600&&score <= 700){
                System.out.println("The eligibility is Maybe eligible");}
            else if(loan&&score >= 701&&score<=800){
                System.out.println("The eligibility is Eligible");}
            else if(loan&&score > 800){
                System.out.println("The eligibility is Definitely eligible");}

        }
}
