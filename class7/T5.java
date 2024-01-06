package Java.class7;

public class T5 {
    public static void main(String[] args) {
        //Create an array of words: Java, Saturday, day, coding, is.
        // Print the following sentence using elements of array: “Saturday is Java coding day”.
        String [] names={"Java","Saturday","day","coding","is"};

        names[0]= "Saturday";
        names[1]= "is";
        names[2]= "Java";
        names[3]= "coding";
        names[4]= "day";
        System.out.println(names[0]+" "+names[1]+" "+names[2]+" "+names[3]+" "+names[4]);
    }
}
