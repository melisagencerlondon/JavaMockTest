package Java.class5;

/*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.

 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your Birthday Month Name");
        String monthName=sc.next();
        String season;
        if(monthName.equalsIgnoreCase("December")||
        monthName.equalsIgnoreCase("January")||
        monthName.equalsIgnoreCase("February")){
            season="Winter";
        } else if (monthName.equalsIgnoreCase("March")||
        monthName.equalsIgnoreCase("April")||
        monthName.equalsIgnoreCase("May")) {
            season="Spring";
        } else if (monthName.equalsIgnoreCase("June")||
        monthName.equalsIgnoreCase("August")) {
            season="Summer";
        } else if (monthName.equalsIgnoreCase("September")||
        monthName.equalsIgnoreCase("October")||
        monthName.equalsIgnoreCase("November")) {
            season="Autumn";
        }else{
            season="Invalid";
        }

        System.out.println("You were born is season "+season);

    }

    }

