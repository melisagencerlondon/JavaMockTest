package Java.class15;

public class Book {
    private String title;
    private String author;
    private int noOfPages;
    private String publisher;
    private double price;

    public Book(String title, String author, int noOfPages, String publisher) {
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
        this.publisher = publisher;

    }

    public Book(String title, String author, int noOfPages, String publisher, double price) {
        this(title, author, noOfPages, publisher);
        this.price = price;
    }

    public void printInfo(){
        System.out.println(title+" "+author+" "+noOfPages+" "+publisher);
    }

    public void printAllInfo(){
        System.out.println(title+" "+author+" "+noOfPages+" "+publisher+" "+price);
    }

    public static void main(String[] args) {
        new  Book("Bugun Bayram olsa","Melisa Gencer",270,"Turkish",120).printInfo();
        new  Book("Ungrateful Child","Zeynep gencer",110,"English").printInfo();

    }
}