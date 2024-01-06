package Java.class18;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(str.concat("And welcome"));
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("And welcome");
        System.out.println(sb);
    }


}
