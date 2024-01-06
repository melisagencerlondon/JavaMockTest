package Java.class5;

import java.util.Scanner;
//3. Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
//if the average score >=90 → grade=A
//if the average score >= 70 and <90 → grade=B
//if the average score>=50 and <70 → grade=C
//if the average score<50 → grade=F

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double quizMarks,midMarks,finalMarks,avgMarks;
        char grade;
        System.out.println("Please enter the mark for quiz 0-100 ");
        quizMarks= sc.nextDouble();
        System.out.println("Please enter mark for midterm 0-100");
        midMarks= sc.nextDouble();
        System.out.println("Please enter mark for final 0-100");
        finalMarks= sc.nextDouble();
        avgMarks=(quizMarks+midMarks+finalMarks)/3;
        if (avgMarks>=90){
            grade='A';
        }else if(avgMarks>=70){
            grade='B';

        }else if(avgMarks>=50){
            grade='C';
        }else{
            grade='F';
        }

        System.out.println(grade);
    }
}
