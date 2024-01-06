package Java.class7;

public class T6 {
    public static void main(String[] args) {
        //Create an array to store char values and then print those in reverse order
        char [] num=new char[4];
        num[0]='a';
        num[1]='b';
        num[2]='c';
        num[3]='d';

        for(int i=3;i>= 0;i--)
        {
            System.out.println(num[i]);
        }

    }

}
