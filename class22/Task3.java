package Java.class22;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("park");
        words.add("house");
        words.add("box");
        words.add("ada");
      // words.removeIf(x->x.endsWith("a"));
      //  System.out.println(words);
        words.forEach(x-> System.out.println(x));
    }
}
