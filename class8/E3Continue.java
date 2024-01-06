package Java.class8;

public class E3Continue {
    public static void main(String[] args) {
        int [] numbers= {10, 20, 30, 40, 45, 55, 25, 80, 90};
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]%2!=0){
                continue;
            }
            System.out.println(numbers[i]);
        }
    }
}
