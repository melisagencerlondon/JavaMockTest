package Java.Review4;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i=1; i<3; i++){//outer loop
            System.out.println("Hello ");
            for (int j=1; j<3; j++) {//inner loop//inner loop always depend on outer loop
                System.out.println("Bye");
                }
                System.out.println("--------------------");
                for (int a = 1; a <= 3; a--) {//outer loop
                    System.out.println("Hello ");
                    for (int x = 1; x < 3; x++) {//inner loop//inner loop always depend on outer loop
                        System.out.println("Bye");
                    }
                    System.out.println("--------------------");
                    //infinete inner loop
                    for (int b = 1; b <= 3; b--) {//outer loop
                        System.out.println("Hello ");
                        for (int y = 1; y < 3; y++) {//inner loop//inner loop always depend on outer loop
                            System.out.println("Bye");
                        }
                    }
                }
            }}}
