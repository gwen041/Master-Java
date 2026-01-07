package EXERCISES.Exercise12;

import java.util.Scanner;

public class Main {

    public boolean sumChecker(int sum, int n) {
        if (sum != n) {
            return false;
        }

        return true;
    }
            
        
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = new int[3];
        int sum;

        Scanner input = new Scanner(System.in);

        // System.out.print("Enter the first number: ");
        // n1 = input.nextInt();

        // System.out.print("Enter the second number: ");
        // n2 = input.nextInt();

        // System.out.print("Enter the third number: ");
        // n3 = input.nextInt();


        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            nums[i] = input.nextInt();
        }

        sum = nums[0] + nums[1];


        System.out.println("The result is: " + (main.sumChecker(sum, nums[2]) ? "true" : "false"));

        input.close();

    



        
        

    }
}