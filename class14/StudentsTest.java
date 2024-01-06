package Java.class14;

public class StudentsTest {//
    /*Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students*/
    public static void main(String[] args) {
        Students x=new Students();
        x.name="Gulizar";
        x.ID= 12346777;
        x.numberOfStudents=30;
        //x.printInfo();
        System.out.println(Students.numberOfStudents++);

        Students y=new Students();
        y.name="Sare";
        y.ID=377789;
        y.numberOfStudents=45;
        //y.printInfo();
        System.out.println( Students.numberOfStudents++);

        Students z=new Students();
        z.name="Buket";
        z.ID=8653553;
        z.numberOfStudents=64;
        //z.printInfo();
        System.out.println(Students.numberOfStudents++);





    }
}
