package Java.class4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Please enter the loan amount ");
        Scanner scanner=new Scanner(System.in);
        double loan= scanner.nextDouble();
        if(loan<=200000){
        System.out.println("You can get this loan");}
        else {
            System.out.println("You can't get loan");
        }

    }
}
