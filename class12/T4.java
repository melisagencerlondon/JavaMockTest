package Java.class12;

public class T4 {
    public static void main(String[] args) {
        /*Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL*/
        String mumName = "Anna";
        String dadName = "Ali";
        boolean isBoy = true;
        if (isBoy) {
            String dadfirstPart=dadName.substring(0,dadName.length()/2);
            String mumlastPart=mumName.substring(mumName.length()/2,mumName.length());
            System.out.println(dadfirstPart.trim()+mumlastPart.trim());

        }else{
            String mumfirstPart = mumName.substring(0, mumName.length() / 2);
            String dadLastPart = dadName.substring(dadName.length() / 2, dadName.length());
            System.out.println(mumfirstPart.trim() + dadLastPart.trim());
        }
    }
}
