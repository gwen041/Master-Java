package OOP.Practice13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        Dog myDog = new Dog("Scruffy", "Shitzu");

        System.out.println("Old name: " + myDog.getName() + "\n" + "Breed: " + myDog.getBreed());


        System.out.print("Change your dog's name: ");
        String newName = in.nextLine();

        in.close();

        myDog.setName(newName);
        System.out.println("New name: " + myDog.getName() + "\n" + "Breed: " + myDog.getBreed());

    }  
}