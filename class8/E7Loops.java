package Java.class8;

public class E7Loops {
    public static void main(String[] args) {
        char[] word = {'S', 'u', 'n', 'd', 'a', 'y'};
        for (int i =word.length-1;i>0; i--) {
            System.out.print(word[i]+" ");
        }
    }
}
//to reverse the loop we need to do -1 on length