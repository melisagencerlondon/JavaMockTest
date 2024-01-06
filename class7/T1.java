package Java.class7;

public class T1 {
    //Create an array of chars and store grades into it:
    // A,B,C,D. Then print a grade B (use 2 different ways of creating an array).
    public static void main(String[] args) {
        char[] grade=new char[4];
        grade[0]='A';
        grade[1]='B';
        grade[2]='C';
        grade[2]='D';

        System.out.println(grade[1]);
        String [] grade1={"A","B","C","D"};
        System.out.println(grade1[1]);

    }




}
