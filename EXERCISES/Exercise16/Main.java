package EXERCISES.Exercise16;

import java.util.*;

public class Main {

    public boolean numChecker (int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4 || nums[i] != 7) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Main obj1 = new Main();
        Scanner in = new Scanner(System.in);

        int[] nums = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = in.nextInt();
        }

        System.out.print("Original Array: ");
        System.out.print(Arrays.toString(nums) + "\n");
        System.out.println("The array contains 4 or 7: " + obj1.numChecker(nums));

        in.close();    
    }  
}

