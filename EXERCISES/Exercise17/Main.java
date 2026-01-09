package EXERCISES.Exercise17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the cat's name: ");
        String catName = in.nextLine();

        System.out.print("Enter the cat's age: ");
        int catAge = in.nextInt();

        in.close();

        Cat cat1 = new Cat(catName, catAge);

        System.out.println("The name of the cat is " + cat1.getName());
        System.out.println("The age of the cat is " + cat1.getAge());
    }
    
}
