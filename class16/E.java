package Java.class16;

public class E {//Write program to inherit class E that has method printF
    // which is static and call or reuse that method into class F
    public static void printF(){
        System.out.println("Hello");
    }
}
class F extends E{

}
class ETester{
    public static void main(String[] args) {
        F.printF();
    }
}
