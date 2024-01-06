package Java.class9;

public class T4 {
    public static void main(String[] args) {
        String[][] cars={
                {"Chev","Ford","Dodge"},
                {"Volks","BMW","Mers"},
                {"hund","Kia","Gene"},
                {"Fiat","Ferrari","lamb"}

        };
        for (int i=0;i<cars.length;i++){
            for (int j=0;j< cars[i].length;j++){
                System.out.print(cars[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("using enhanced for loop");
        System.out.println();
        String [] name={"eeee","eee","uuuu",};
        for (String[] arr:cars ){
            for (String car:arr){
                System.out.print(car+" ");
            }
            System.out.println();
        }
    }
}
