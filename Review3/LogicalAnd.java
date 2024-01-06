package Java.Review3;

public class LogicalAnd {
    //for logical &&-All conditions needs to be true to get a true
    public static void main(String[] args) {
        boolean rain=true;
        boolean cold=true;
        if (cold&&rain){
            System.out.println("I am staying home");
        }

    boolean messageDisplay=true;
        String errorMessage="Invalid credidentials";

        if (messageDisplay&&errorMessage.equals("Invalid Credidentials")){
            System.out.println("Test Case passed");
        }else{
            System.out.println("Test Case failed");
        }



    }

}
