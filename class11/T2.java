package Java.class11;

public class T2 {
    public static void main(String[] args) {
        String str="Java is fun";
        int count=0;
        for (int i=0; i < str.length(); i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }


        System.out.println(count);


    }//String str="  Hello   ";//hello
   //
}
