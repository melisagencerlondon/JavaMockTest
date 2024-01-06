package Java.class5;

public class E6LogicalAND {
    public static void main(String[] args) {
        boolean cond1=true;
        boolean cond2=false;
        boolean cond3=false;
        if (cond1&&cond2&&cond3){
            System.out.println("If");
        }else{
            System.out.println("Else");
        }
    }
}
// if one condition is false in AND condition, java execute else part means false