package OOP.Practice01;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Solo Leveling", "Chu Gong", 199);
        Book book2 = new Book("X-men", "Stan Lee");
        Book book3 = new Book("Moon Knight", "Jes Castillo", 230);

        System.out.printf("TITLE: " + book1.getTitle() + "\n" + "AUTHOR: " + book1.getAuthor() + "\n" + "PRICE: %.2f", book1.getPrice());
        System.out.printf("%n%nTITLE: " + book2.getTitle() + "\n" + "AUTHOR: " + book2.getAuthor() + "\n" + "PRICE: %.2f", book2.getPrice());
        System.out.printf("%n%nTITLE: " + book3.getTitle() + "\n" + "AUTHOR: " + book3.getAuthor() + "\n" + "PRICE: %.2f", book3.getPrice());

        book1.comparePrice(book2, book3); 
    }
}

