package OOP.Practice10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter your age: ");
        int age = in.nextInt();
        in.nextLine();

        System.out.print("Enter your city: ");
        String city = in.nextLine();

        in.close();


        Person p1 = new Person(name, age);
        Person.Address addr1 = p1.new Address(city);
        Person.Address addr2 = p1.new Address("Los Angeles", "California");
        

        System.out.println(p1);
        System.out.println("\nADDRESS 1 ");
        addr1.showAdr();
        System.out.println("\nADDRESS 2: ");
        addr2.showAdr();
    } 
}