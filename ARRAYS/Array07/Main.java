package ARRAYS.Array07;

import java.util.*;

public class Main {

    public void findIndex(int[] nums, int num) {
        boolean isFound = false;

        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                System.out.println(num + " has the index of " + i + " or nums[" + i + "]");
                isFound = true;
            }
        }

        if(!isFound) {
            System.out.println(num + " is not in the array!");
        }    
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers you want to input in the array?: ");
        int n = in.nextInt();

        int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i+1) + ": ");
                nums[i] = in.nextInt();
            }

        System.out.println(Arrays.toString(nums));

        System.out.print("Find the index of: ");
        int num = in.nextInt();

        in.close();

        main.findIndex(nums, num);
    }   
}
// Find index of an element in array