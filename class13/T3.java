package Java.class13;

public class T3 {public static void main(String[] args) {

}

    void isPalidrome(String word) {
        String reverseName = " ";


        for (int i = word.length() - 1; i >= 0; i--) {
            reverseName = reverseName + word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverseName)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}
