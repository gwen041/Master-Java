package OOP.Practice05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int x1, y1;
        double x2, y2;

        while (true) {
            try {
                System.out.print("\nEnter x (integer): ");
                x1 = in.nextInt();

                System.out.print("Enter y (integer): ");
                y1 = in.nextInt();

                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Wrong input! Enter an integer.");
                in.nextLine();
                
            }
        }

        while(true) {
            try {
                System.out.print("\nEnter x (double): ");
                x2 = in.nextDouble();
                
                System.out.print("Enter y (double): ");
                y2 = in.nextDouble();

                break;
            } 
            catch (InputMismatchException e) {
                System.out.println("Wrong input! Enter a double.");
                in.next();
            }
        }
        in.close();
        
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        
        p1.printVar();
        p2.printVar();   
    }  
}