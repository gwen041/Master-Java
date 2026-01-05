package EXERCISES.Exercise01;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args ) {
        int a, b, temp;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number to swap: ");
        a = input.nextInt();

        System.out.print("Enter the second number to swap: ");
        b = input.nextInt();

        System.out.println("\nBEFORE SWAPPING:");
        System.out.println("Number 1: " + a + "\n" + "Number 2: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("\nAFTER SWAPPING:");
        System.out.println("Number 1: " + a + "\n" + "Number 2: " + b + "\n");

        input.close();
        
    }

}
