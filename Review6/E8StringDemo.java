package Java.Review6;

public class E8StringDemo {
    public static void main(String[] args) {
        String str="this one should be false";
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("one"));//once found the word
        // it is going to write first letter.//it gets index of first match.
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("z"));
        System.out.println(str.lastIndexOf('o'));//it will start from right to left
    }
}
