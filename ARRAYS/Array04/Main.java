package ARRAYS.Array04;

import java.util.*;

public class Main {

    public int largestNum(int[] nums) {
        int large = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > large) {
                large = nums[i];
            }
        }
        return large;
    }

    public int smallestNum(int[] nums) {
        int small = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < small ) {
                small = nums[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers you want to enter?: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = in.nextInt();
        }

        in.close();

        System.out.println(Arrays.toString(nums));
        System.out.println("Largest number: " + main.largestNum(nums));
        System.out.println("Smallest number: " + main.smallestNum(nums));
    } 
}