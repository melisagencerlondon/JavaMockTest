package Java.class7;

public class T4 {
    public static void main(String[] args) {
        //Create an array of animals and store 5 elements into it.
        // Using 2 different loops print all elements from the array.
        String [] animals={"cat","dog","horse","fish","turtle"};
        System.out.println(animals[0]+" "+animals[1]+" "+animals[2]+" "+animals[3]+" "+animals[4]);

        String[] animals1=new String[5];
        animals1[0]= "cat";
        animals1[1]= "dog";
        animals1[2]= "horse";
        animals1[3]= "fish";
        animals1[4]= "turtle";

        System.out.println(animals1[0]+" "+animals1[1]+" "+animals1[2]+" "+animals1[3]+" "+animals[4]);
    }
}
