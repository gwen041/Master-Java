package OOP.Practice12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Rectangle (Length): ");
        double l = in.nextDouble();

        System.out.print("Rectangle (Width): ");
        double w = in.nextDouble();

        System.out.print("Circle (Radius): ");
        double rad = in.nextDouble();

        System.out.print("Triangle (Base): ");
        double b = in.nextDouble();

        System.out.print("Triangle (Height): ");
        double h = in.nextDouble();

        in.close();

        Shape rectangle = new Rectangle(l, w);
        Shape circle = new Circle(rad);
        Shape triangle = new Triangle(b, h);

        System.out.println("\nRectangle Area: " + rectangle.getArea());
        System.out.printf("Circle Area: %.2f", circle.getArea());
        System.out.println("\nTriangle Area: " + triangle.getArea());
    } 
}