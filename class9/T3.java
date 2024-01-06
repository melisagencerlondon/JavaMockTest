package Java.class9;

public class T3 {
    public static void main(String[] args) {
        String[][] grocery={
                {"Tomao","potato","onion"},
                {"apple","orange","plum"},
                {"milk","cheese","cream"},
                {"jelly","cake","biscuit"}
        };
        for (int i=0; i<4;i++){
            for (int j=0; j<3;j++){
                System.out.print(grocery[i][j]+" ");
            }

            System.out.println();
        }
        System.out.println("-----second------");
        for (String[] arr:grocery){
            for (String groceryy:arr){
                System.out.print(groceryy+" ");
            }
            System.out.println();
        }
    }
}

