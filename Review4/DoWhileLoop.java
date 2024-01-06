package Java.Review4;

public class DoWhileLoop {
    public static void main(String[] args) {
        // do while -when we do NOT know in advance
        // how many times we want to repeat block of code
        /*while vs do while
        * in do while block of code will be executed at least once
        * even when condition is true*/
        //i want to say hello 4 time
        int n=1;
        do {
            System.out.println("Hello");
            n++;   //need to make sure increment happens inside the loop{}
        }while (n>=4);
        //n++; when we put inc outside the body it will go forever
        System.out.println(n);
        System.out.println("--------Another way-------");

        int i=0;
        do {
            if (i%2==0)
            System.out.print(i+" ");
            i++;
        }while (i<=10);
    }
}
