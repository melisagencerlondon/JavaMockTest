package Java.class8;

public class T3 {
    public static void main(String[] args) {
        int[] num = {10, 15, 20, 18, 9, 60, 22, 30};
        //show the sum of even numbers and odd numbers
        //seperatly
        int sumodd = 0, sumeven = 0;
        for (int x : num) {
            if (x % 2 == 0) {
                sumeven = sumeven +x;
            }else{
                sumodd=sumodd+x;

                }
            }
            System.out.println("sum of even numbers is "+sumeven);
            System.out.println("sum of odd numbers is "+sumodd);
        }
    }


