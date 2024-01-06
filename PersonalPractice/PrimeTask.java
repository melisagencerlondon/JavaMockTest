package Java.PersonalPractice;

public class PrimeTask {

   // Write a method to return whether given number is prime or not?
    void isPrime(int number){
        int count=0;
        for (int i=0; i<=number; i++){
            if (number%i==0){
                count++;
            }else if(count==2) {
                System.out.println("Is prime");
            }else{
                System.out.println("Not prime");
            }
        }

    }
}
