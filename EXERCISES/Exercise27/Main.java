package EXERCISES.Exercise27;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice = 0;
        
        while(true) {
            try {
                System.out.print("Enter a number (1-7): ");
                choice = in.nextInt();

                if (choice >= 1 && choice <= 7) {
                    break; 
                }

                System.out.println("Invalid choice! Please choose from 1-7.");
            }
            catch (InputMismatchException e) {
                System.out.println("Error: Numbers only!");
                in.next();
            }
        }
        in.close();

        switch (choice) {
                case 1: 
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }     
    }
}