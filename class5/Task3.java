package Java.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write the time");
        int time= sc.nextInt();
        if (time>=1&&time<=11){
            System.out.println("Morning");
        } else if (time>=12&&time<=15) {
            System.out.println("Afternoon");

        } else if (time>=16&&time<=20) {
            System.out.println("Evening");

        } else if (time>=21&&time<=24) {
            System.out.println("Night");

        }else{
            System.out.println("invalid");
        }

    }
}
