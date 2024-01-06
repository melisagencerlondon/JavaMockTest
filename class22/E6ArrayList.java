package Java.class22;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Melisa");
        names.add("Gulizar");
        names.add("Savda");
        names.add("Sare");
        names.add("Buket");
        for (int i=0;i<names.size();i++) {
            String s=names.get(i);
            if (s.contains("o")) {
                names.set(i,"Java");
            }
        }
        System.out.println(names);
    }
}
