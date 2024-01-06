package Java.class4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age= scanner.nextInt();
        if(age>=18){
        System.out.println("I will issue a licence to you");
    }else{
            System.out.println("for you can only have a learners permit");}
        }
}
