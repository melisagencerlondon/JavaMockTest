package Java.class17;

public class Parent {
    String name = "Ismail";
}
    class Child extends Parent{
        String name="Maryam";//if we don't have this part it will print Ismail.
        void print(){
            String name="Lisa";//if we don't have this part it will print Maryam.
            System.out.println(this.name);//when we put this it will print Maryam;
            // if put super will print Ismail;if there is nothing just name it will print Lisa.

        }
    }
    class Tester{
        public static void main(String[] args) {
            Child c=new Child();
            c.print();
        }
    }
