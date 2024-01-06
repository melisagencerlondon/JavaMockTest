package Java.class15;

public class Students {
private String name;
private double s1Marks;
private double s2Marks;
private double s3Marks;
public Students(String pName, double m1,double m2, double m3){
    name=pName;
    s1Marks=m1;
    s2Marks=m2;
    s3Marks=m3;

    }
public void calcAvg(){
    double avg=(s1Marks+s2Marks+s3Marks)/3;
    System.out.println(name+"s Avg Marks are "+avg);
}

}
