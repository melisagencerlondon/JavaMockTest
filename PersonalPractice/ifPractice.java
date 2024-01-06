package Java.PersonalPractice;

import java.util.Scanner;
//  Scanner sc=new Scanner(System.in);
//        double num1,num2;
//        String operator;
//        System.out.println("Enter first number");
//        num1 =sc.nextDouble();
//        System.out.println("enter second number ");
//        num2 = sc.nextDouble();
//        System.out.println("enter a operator(+,-,*,/)");
//        operator = sc.next();

public class ifPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num1,num2;
        String operator;
        System.out.println("enter first number");
        num1= sc.nextDouble();
        System.out.println("enter second number");
        num2= sc.nextDouble();
        System.out.println("enter an operator(-,+,/,*)");
        operator =sc.next();
        if (operator.equals("-")){
            System.out.println(num1-num2);
        }else if(operator.equals("*")){
            System.out.println(num1*num2);
        }else if(operator.equals("+")){
            System.out.println(num1+num2);
        } else if (operator.equals("/")) {
            System.out.println(num1/num2);

        }


    }
}
