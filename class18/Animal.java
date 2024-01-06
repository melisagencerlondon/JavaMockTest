package Java.class18;

public class Animal {
    private String name;
    private String color;
    private int age;
    private double weight;
    Animal(String name,String color,int age,double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;

    }
    public void sleep(){
        System.out.println("Zzzzzzzzzzzzz");
    }
    public void speak(){
        System.out.println("Animal speaking");
    }

    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+ weight);
    }
}
/*class Tester1{
    public static void main(String[] args) {
        Animal a=new Animal("")*/
class Dog extends Animal{
    Dog(String name,String color,int age,double weight){
        super(name,color,age,weight);

    }
    public void speak(){
        System.out.println("Wuff wuff...");

}
void demo(String str){
    System.out.println(str);
    }
}
