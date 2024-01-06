package Java.class9;

public class T1 {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},//columns dont need to be same,one can be 3 the other can 4 or mor or less
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
        int sum=0;

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++)
            sum=sum+matrix[i][j];
           //System.out.println(sum);//it will give you all the the columns and rows sum individually

        }
        System.out.println(sum);
}
}
