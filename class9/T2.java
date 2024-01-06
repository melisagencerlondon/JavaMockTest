package Java.class9;

public class T2 {
    public static void main(String[] args) {
        String[][] names={
                {"Buket","Sare","Gulizar","Melisa"},
                {"A","B","C","D"}
        };
        for (int i=0;i<4;i++){
            if (names[1][i].equals("A")||names[1][i].equals("B"))
                System.out.println(names[0][i]+" "+names[1][i]);
            //we are going column by column in this example




        }


    }
}
