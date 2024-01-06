package Java.class22;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Water");
        drinks.add("milk");
        drinks.add("Tea");
        drinks.add("coffe");
        for (int i = 0; i < drinks.size(); i++) {
            String s = drinks.get(i);
            if (s.contains("a")||s.contains("e")) {
                drinks.set(i, "water");
            }
            System.out.println(drinks);

        }

    }}