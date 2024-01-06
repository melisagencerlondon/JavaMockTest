package Java.class21;

public class FileTester {
    public static void main(String[] args) {
        File[] arr = {new JavaFile("notepad", 15), new WordFile("Microsoft", 10), new PdfFile("Pdf", 5)};
        for (File f : arr) {
            f.open();
            f.edit();
            f.close();
        }
    }
        }

