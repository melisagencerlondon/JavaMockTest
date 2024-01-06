package Java.class5;

import java.util.Scanner;

public class Task6Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the country");
        String  country=scanner.nextLine();
        switch (country){
            case "Turkiye":
                System.out.println("Turkish");
                break;
            case "Spain":
                System.out.println("Spanish");
                break;
            case "China":
                System.out.println("Chineese");
                break;
            case "Pakistan":
                System.out.println("Urdu");
                break;
            case "Dubai":
                System.out.println("Arabic");
                break;
            default:
                System.out.println("Invalid");

        }


    }
}
