package EXERCISES.Exercise22;

import java.util.Scanner;

public class Main {

    public int largestNum(int[] nums) {
        int largestNum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestNum) {
                largestNum = nums[i];   
            } 
        }
        return largestNum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Main main = new Main();
        
        System.out.print("How many numbers you want to input?: ");
        int length = in.nextInt();

        int[] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = in.nextInt();
        }

        in.close();

        System.out.println("The largest number is: " + main.largestNum(nums));
    }  
}
