package EXERCISES.Exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int div1, div2, div3;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st number to check divisibility: ");
        div1 = input.nextInt();

        System.out.print("Enter the 2nd number to check divisibility: ");
        div2 = input.nextInt();

        div3 = div1 * div2;

        System.out.print("\nDivisible by " + div1 + ": ");
            for (int i = 1; i <= 20; i++) {

                if (i % div1 == 0) {
                    System.out.print(i + " ");
                }
            }

        System.out.print("\n\nDivisible by " + div2 + ": ");
            for (int i = 1; i <= 20; i++) {

                if (i % div2 == 0) {
                    System.out.print(i + " ");
                }
            }

        System.out.print("\n\nDivisible by " + div1 + " & " + div2 + ": ");
            for (int i = 1; i <= 20; i++) {

                if (i % div3 == 0) {
                    System.out.print(i + " ");  
                }
            }

        input.close();
    }
}