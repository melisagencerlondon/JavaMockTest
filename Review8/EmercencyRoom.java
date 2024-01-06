package Java.Review8;
public class EmercencyRoom {
    public static void main(String[] args) {
        Doctor[] doc={
                new Surgeon("john","doe","Surgeon",20,"Fairfax,VA"),
                new Surgeon("micheal","jordan","Surgeon",20,"Vienna"),
                new Surgeon("josh","Smith","Orthodontist",15,"VA")};
        System.out.println("..............Enchanced for Loop............");
        for (Doctor doctor:doc){
            doctor.checkVitals();
            doctor.checkVitals("Jack");
            doctor.prescribeMedication("Pain killer");
        }
        for (int i=0; i<doc.length;i++){
            doc[i].checkVitals();
            doc[i].checkVitals("Jack");
            doc[i].prescribeMedication("pills");
            System.out.println("..............        ");
        }
    }
}
