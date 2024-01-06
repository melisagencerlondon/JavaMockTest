package Java.PersonalPractice;

class Main
{
    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-1,7},
                {-5,-2,-3,-7}
        };
        int Total=0;
        for(int i = 0; i < a.length; i++){
            for(int j=0 ; j < a[i].length; j++){
                if(a[i][j] < 0 && a[i][j] % 2 != 0)
                {
                    System.out.println(a[i][j]);
                    Total++;
                }
            }

        }
        System.out.println(Total);
    }
}
