package Java.class7;

public class T3 {
    public static void main(String[] args) {
        //Create an array of cars and store 6 elements into it.
        // Using 2 different loops print all values from the array.
        String [] cars={"Honda","Tesla","Toyota","Mercedes","Ford","Bmw"};
        System.out.println(cars.length);
        for (int i=0;i<cars.length;i++){
            System.out.print(cars[i]+" ");}
        for (String car: cars){
            System.out.print(car);
        }
    }

}
