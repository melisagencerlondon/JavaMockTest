package Java.class4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please Enter the city name ");
            String city = scanner.nextLine();
            System.out.print("Enter the temperature in Celsius " + city );
            double temperature = scanner.nextDouble();
            double temperatureCelsius = (temperature - 32) * 5 / 9;
            System.out.printf("The temperature in "+city+" is "+temperatureCelsius+"C");
        }
    }
