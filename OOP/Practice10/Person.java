package OOP.Practice10;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) { 
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "\nName: " + name + "\n" + "Age: " + age;
    }
    
    class Address {
        private String city, country;

        public Address(String city) {
            this(city, "Canada");
        }
        
        public Address(String city, String country) {
            this.city = city;
            this.country = country;
        }

        public void showAdr() {
            System.out.println("City: " + city + "\n" + "Country: " + country);
        }
    }  
}


// Write a Java program to create an outer class called Person with an inner class Address. 
// The Address class should have a constructor that takes parameters city and state. 
// Create an instance of Address from the Person class and print the address details.