package Java.class9;

public class E42DArray {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},//columns dont need to be same,one can be 3 the other can 4 or mor or less
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
        //entire one d array from the 2D array
        int[] row0=matrix[0];
        System.out.println(row0.length);//3
        for (int x:row0){
            System.out.print(x+" ");
        }
        System.out.println();
        //accessing individual elements from the 2D array
        System.out.println(matrix[2][2]);//78
    }
}
