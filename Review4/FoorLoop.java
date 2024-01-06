package Java.Review4;

public class FoorLoop {
    public static void main(String[] args) {
        //we use for loop when we DO KNOW in advance
        //how many times we want to repeat
        /*for (initialization ;condition; increment/decrement){code to repeat;*/
        for (int i=0; i<4; i++){
            System.out.println("Hello "+i);
        }
        for (int i=2;i<10; i+=3){
            System.out.println(i);//2 5 8
        }
        //we want to print numbers from 10 till 2
        for (int i=10; i>=2; i--){
            System.out.print(i+" ");


        }for (int i=10; i<2; i--){
            System.out.print(i+" ");//no executing because condition is false
        }
        for (int i=10; i>=2; i++){
            System.out.print(i+" ");//10 11 12 and infinite
        }

    }
}
