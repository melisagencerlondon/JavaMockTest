package Java.class21;
interface FileReader{
    public void read();
}//Created by Microsoft
public class ExcelFile  implements FileReader{
    public void read(){
    }
}
//created by Notepad++
class TxtFile implements FileReader{
   public void read(){
       System.out.println("reading text file");

    }

}
