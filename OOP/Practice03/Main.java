package OOP.Practice03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius for circle: ");
        Circle c1 = new Circle(in.nextDouble());

        Circle c2 = new Circle(c1);

        in.close();


        System.out.println("Circle 1 Radius: " + c1.getRad());
        System.out.println("Circle 2 Radius: " + c2.getRad());
        System.out.printf("Circle 1 Area: %.2f", c1.calcArea());
        System.out.printf("%nCircle 2 Area: %.2f", c2.calcArea());
        System.out.printf("%nCircle 1 Circumference: %.2f", c1.calcCircumf());
        
        
    }
    
}
