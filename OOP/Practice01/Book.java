package OOP.Practice01;

public class Book {
    private String title, author;
    private double price;

    public Book(String title, String author) {
        this(title, author, 180);
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void comparePrice(Book book2, Book book3) {
        if (this.price > book2.price && this.price > book3.price) {
            System.out.println("\n".repeat(2) + this.title + " is the most expensive book");
        } 
        else if (book2.price > this.price && book2.price > book3.price) {
            System.out.println("\n".repeat(2) + book2.title + " is the most expensive book");
        } 
        else if (book3.price > this.price && book3.price > book2.price) {
            System.out.println("\n".repeat(2) + book3.title + " is the most expensive book");
        } else {
            System.out.println("\n".repeat(2) + "The three books have the same price");
        }
    }   
}
