package Java.class9;

public class E32DArrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},//columns dont need to be same,one can be 3 the other can 4 or mor or less
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
        int[] row=matrix[2];//50
        System.out.println(row[2]);//78
        for (int i=0;i<row.length;i++){
            System.out.print(row[i]+" ");
        }

    }
}
