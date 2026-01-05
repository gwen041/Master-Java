package EXERCISES.Exercise03;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int num, digit;
        int sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = in.nextInt();

        while (num != 0) {
            digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("The sum of digits: " + sum);

        in.close();
    }
}