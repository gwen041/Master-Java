package EXERCISES.Exercise21;

import java.util.Scanner;

public class Main {

    public void compareNums(int[] nums) {
        if (nums[0] == nums[1] && nums[1] == nums[2] && nums[2] == nums[3]) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = in.nextInt();
        }
        
        main.compareNums(nums);

        in.close();
    }
    
}
