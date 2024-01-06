package Java.class14;

public class t1 {
    int sumArray(int [] arr){


        int sum=0;
        for (int i=0; i<arr.length;i++){
            sum=sum+arr[i];

        }
        return sum;

    }

    public static void main(String[] args) {
        t1 t=new t1();
        int[] number={10,30,20};
        int sum=t.sumArray(number);
        System.out.println(sum);
    }




}
