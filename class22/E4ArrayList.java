package Java.class22;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Melisa");
        names.add("Poorna");
        names.add("Damla");
        names.add("Sare");
        for(int i=0;i<names.size();i++){
            String s=names.get(i);
            System.out.println(s.length());
        }
        System.out.println("............");
        for (String s:names){
            System.out.println(s);
        }
    }
}
