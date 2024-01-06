package Java.class12;

public class T2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special
        // characters. Find out how many alpha characters are there in the String.
        String str="12335!@TdEgD";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
        //System.out.println(str.length());
        //System.out.println(str.toLowerCase());
        //System.out.println(str.toUpperCase());

    }
}
