package Java.class22;

import java.util.ArrayList;

public class TaskCars {
    public static void main(String[] args) {
        //Create an arraylist of cars and
        //retrieve all the values using 2 different ways.
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Jaguar");
        System.out.println(cars);
        for (int i=0;i< cars.size();i++){
            System.out.println(cars.get(i));
        }
        for (String car:cars){
            System.out.println(car);
        }

    }
}
