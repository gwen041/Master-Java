package OOP.Practice09;

public class Library {
    private String libName = "Fully Booked";

    class Book {

        public String getLibName() {
            return libName;
        }
    }
    
}

// Write a Java program to create an outer class called Library with an instance variable libraryName. 
// Create an inner class Book with a method getLibraryName() that returns the name of the library. 
// Instantiate the Book class and call the getLibraryName() method.
