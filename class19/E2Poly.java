package Java.class19;

public class E2Poly {
    public static void main(String[] args) {
        Dog d1=new Dog("Jacky","Black",1,12);
        Dog d2=new Dog("Macky","Black",1,12);
        Cat c1= new Cat("Matty","Black",1,12);
        Animal a1=new Animal("Hoky","white",1,12);

        Animal [] arr={d1,d2,c1,a1};

        Animal a2=arr[0];
        a2.printInfo();

     }
}
