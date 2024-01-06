package Java.class11;

public class E7StringDemo {
    public static void main(String[] args) {
        String str="Java is fun";
        char c= str.charAt(0);
        System.out.println(c);
        for (int i=0;i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
