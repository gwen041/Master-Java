package EXERCISES.Exercise02;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        }

        if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        }

        if (num1 != num2) {
            System.out.println(num1 + " != " + num2);   
        }
        else {
            System.out.println(num1 + " = " + num2);
        }

        input.close();

    }
}