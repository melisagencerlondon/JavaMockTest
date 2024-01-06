package Java.Review2;

public class NestedIf {
    public static void main(String[] args) {
        // nested if -> if statement inside another if
        /*
        if(condition){
        if (condition){
        }


         */
        boolean allergy=true;
        String allergyType="peanut";
        if (allergy){ //outer if
            System.out.println("Let's check what kind of allergy you have");

            if (allergyType.equals("peanut")){ //nested if or inner if
                System.out.println("Please avoid food that contains peanuts"); //we added else if later
            }else if (allergyType.equals("dairy")){
                System.out.println("Please avoid food with dairy products");
            }else if(allergyType.equals("pollen")){
                System.out.println("Please stay indoor when trees are blooming");
            }
        }
    }
}
