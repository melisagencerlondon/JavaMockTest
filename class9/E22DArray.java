package Java.class9;

public class E22DArray {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},//columns dont need to be same,one can be 3 the other can 4 or mor or less
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
        System.out.println(matrix[1][1]);//35
        System.out.println(matrix[0][2]);//50
        System.out.println(matrix[3][2]);//66
       // System.out.println(matrix[4][2]);//error as there are only 3 colomuns
       // System.out.println(matrix[0][3]);//error
        System.out.println(matrix.length);//gives number of rows//4
        System.out.println(matrix[0].length);//3
        System.out.println(matrix[2].length);//4

    }
}
