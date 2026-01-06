package EXERCISES.Exercise09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int min, max;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("PICK FROM THE RANGE (1-100)");
        System.out.print("Minimum: ");
        min = input.nextInt();

        System.out.print("Maximum: ");
        max = input.nextInt();

        int length = max - min;
        
        int[] oddNum = new int[length];

            for (int num = min; num <= max; num++) {
            
                if (num % 2 != 0) {
                    oddNum[i++] = num;   
                }   
            }

            for (int j = 0; j < i; j++) {
                System.out.printf("%9d%n",oddNum[j]);
                sum += oddNum[j];
            }
        
        System.out.print("Total: " + sum);
        
        input.close();
    }
}