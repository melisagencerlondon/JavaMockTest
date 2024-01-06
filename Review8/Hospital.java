package Java.Review8;

import Java.Review8_1.Orthodontist;

public class Hospital {
    public static void main(String[] args) {
        Doctor.hospital="Inova";
        Surgeon surgeon=new Surgeon("Ahmed","Genc","Surgeon",20,"London");
        surgeon.checkVitals();//pearent class
        surgeon.checkVitals("John Simith");//parent class
        surgeon.prescribeMedication("Smith");//child class
        Doctor.work();//accessing static method in static way from the class where it was defined
        Surgeon.work();//accessing static method from parent class in static way using child className
        System.out.println("...................................");
        Orthodontist ortho=new Orthodontist("Josh","Smith","Orthodontist",16);
        Orthodontist.work();//parent
        ortho.checkVitals();//parent
        ortho.prescribeMedication("Pain killers");//child
         /*
            Polymorphism in JAVA:
                1. Compile Time/Static Binding/ Early Binding
                    achieved through method overloading
                2. RunTime /Dynamic Binding/ Late Binding
                    achieved through method overriding
         */
        System.out.println("....................");
        Doctor ortho1=new Orthodontist("Josh","Smith","Orthodontist",14);
        ortho1.checkVitals();
        ortho1.checkVitals("Micheal");
        // we are achieving a runtime poly through method overriding
        //during run time Java gives preference to the Object type (in this case it Object of chilc class)
        ortho1.prescribeMedication("pills");//java executed child class method
        Doctor sur=new Surgeon("john","deo","Surgeon",20,"VA");
        sur.checkVitals();
        sur.checkVitals("Muhammad");
        sur.prescribeMedication("pills");
    }
}

