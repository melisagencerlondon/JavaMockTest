package Java.class18;

public class Printer {// an example of private method overloading
    private void print(){
        System.out.println("Hello");
    }
    private void print(String word){
        System.out.println(word);
    }
}
