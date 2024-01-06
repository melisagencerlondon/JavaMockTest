package Java.Review7;

public class E1Method {
    void print(){
        System.out.println();

    }

    public static void main(String[] args) {
       // new E1Method().print();//this is one way
       E1Method a=new E1Method();
       a.print();
       String str=new String("Java");
        System.out.println(str.toLowerCase());


    }
}
