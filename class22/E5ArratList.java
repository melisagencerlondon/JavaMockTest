package Java.class22;

import java.util.ArrayList;

public class E5ArratList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Melisa");
        names.add("Gulizar");
        names.add("Damla");
        names.add("Sare");
        names.add("Buket");
        System.out.println(names.isEmpty());
        System.out.println("Zahra");
        System.out.println(names.size());

        for (String name : names) {
            if (name.contains("o")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
