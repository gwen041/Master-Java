package OOP.Practice09;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Library.Book book = lib.new Book();

        System.out.println(book.getLibName());

    }
}