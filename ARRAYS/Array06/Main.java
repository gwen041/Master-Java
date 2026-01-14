package ARRAYS.Array06;

import java.util.*;

public class Main {

    public int[] zeroToRight(int[] nums) {
        int temp;

        for (int i = 0; i < nums.length -1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == 0) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }  

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {0, 3, 4, 0, 1, 2, 5, 0};

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("New Array: " + Arrays.toString(main.zeroToRight(nums)));
    }
}