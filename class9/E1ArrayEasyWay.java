package Java.class9;

public class E1ArrayEasyWay {
    public static void main(String[] args) {
        int [] numbers={10,25,26,30,40,45,45};
        int previous=numbers[0];
        boolean isSorted=true;
        for (int current:numbers){
            if (previous>current){
                isSorted=false;
                break;

            }
            previous=current;
        }
        System.out.println("Is array sorted "+isSorted);
    }
}
//if you add 35 for example after 25 it will be not sorted. try and test!