package Java.PersonalPractice;

import java.util.Scanner;

public class Scannertask1 {
    public static void main(String[] args) {
        //You are DMV representative, and you need to ask customer their age.
        //If they are 18 or older you will issue a driver license to them,
        // otherwise you will offer them to get a learners permit.
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age ");
        int age=scanner.nextInt();
        if (age>=18){
            System.out.println("I will issue a driver license to you ");
        }else{
            System.out.println("I will offer you a learner permit this time");
        }


    }
}
