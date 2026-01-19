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