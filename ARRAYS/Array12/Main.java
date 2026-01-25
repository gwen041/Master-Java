package ARRAYS.Array12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers you want to input?: ");
            int n = in.nextInt();

            int[] nums = new int[n];
            int count = 0;

    
        while (count < n) {
            try {
                boolean exist  = false;

                System.out.print("Enter number " + (count + 1) + ": ");
                int input = in.nextInt();

                in.close();

                for (int i = 0; i < count; i++) {
                    if (input == nums[i]) {
                        exist = true;
                        break;
                    }
                }

                if(!exist) {
                    nums[count] = input;
                    count++;
                } else {
                    System.out.println(input + " already exists. NO Duplicates.");
                }
            }
            catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                in.next();
            }
        }  
    }
}