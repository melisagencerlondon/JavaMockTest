package Java.class8;

public class T2 {
    public static void main(String[] args) {
        //to count how many numbers are divisible by
        //5 and how many are divisible by 2
        int[] numbers={101,100,25,30,25,50,300};
        int n2=0,n5=0;
        for(int x:numbers){
            if (x%5==0){
                n5++;
           }
            if (x%2==0){
                n2++;
            }
        }
        System.out.println("Numbers divisible by 5 are "+n5);
        System.out.println("Number disible by 2 are "+n2);



        }



        }





