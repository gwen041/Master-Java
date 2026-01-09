package EXERCISES.Exercise18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the age of the first dog: ");
        int age = in.nextInt();

        System.out.print("Enter the age of the second dog: ");
        int age2 = in.nextInt();

        

        // System.out.print("Enter the age of the second dog: ");
        // int dogAge2 = in.nextInt();
        
        in.close();

        Dog dog1 = new Dog(age);
        Dog dog2 = new Dog(age2);

        System.out.println("The first dog's age is: " + dog1.getAge());
        System.out.println("The second dog's age is: " + dog2.getAge());
        dog1.compareAge(dog2);

        
    
    }

        
    
}
