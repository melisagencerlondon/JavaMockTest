package Java.class12;

public class E1StringDemo {
    public static void main(String[] args) {
        String str="Its Savere's birthday today. It's Sunday. Today is Java class";
        String [] strArr= str.split("[.]");
        System.out.println(strArr.length);
        //System.out.println(strArr[0]);
        System.out.println(strArr[2].trim());
    }
}
