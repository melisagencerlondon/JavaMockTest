package Java.class5;

import java.util.Scanner;

//Allow user to enter grade (A, B, or C etc...)
// and then provide explanation:
// A-Excellent, B-Good, C-Average, D-Bad, any
// other grade --> Not Acceptable.
// At the end your program should print which grade was entered
// by a user with explanation.
public class Homework1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double grade,A,B,C,D;
        char grade1;
        System.out.println("Please enter a number for grade ");
        grade= sc.nextDouble();
        System.out.println("PLease enter a number for grade");
        grade= sc.nextDouble();
        System.out.println("PLease enter a number for grade");
        grade = sc.nextDouble();
        System.out.println("PLease enter a number for grade");
        grade = sc.nextDouble();

        if (grade=='A'){
            System.out.println("Excellent");
        }else if(grade=='B'){
            System.out.println("Good");
        }else if(grade=='C'){
            System.out.println("Avarege");
        }else if(grade=='D'){
            System.out.println("Bad");
        }else{
            System.out.println("Not Acceptable");
            System.out.println(grade);
        }


    }
}
