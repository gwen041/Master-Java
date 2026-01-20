package LEETCODE.Practice01;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length -1; i++) {
                
            for (int j = i+1; j < nums.length; j++) {
                int sum = 0;
                
                sum = nums[i] + nums[j];

                if (sum == target) {
                    output[0] = i;
                    output[1] = j;
                }
            } 
        }
        return output;
    }

    public static void main(String[]args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers you want to input?: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i+1) + ": ");
            nums[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.print("Enter your target number: ");
        int target = in.nextInt();
        
        in.close();

        System.out.println("Output: " + Arrays.toString(main.twoSum(nums, target)));
    }  
}