package Java.PersonalPractice;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num1,num2;
        String operator;
    System.out.println("enter first num");
    num1= scanner.nextDouble();
        System.out.println("enter second num");
        num2= scanner.nextDouble();
        System.out.println("enter an operator(-,+,/,*)");
        operator= scanner.next();

        switch(operator){
            case "-":
                System.out.println(num1-num2);
                break;
            case "+":
                System.out.println(num1+num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("invalid");
                break;
        }



    }
}
