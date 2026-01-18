package ARRAYS.Array08;

import java.util.*;

public class Main {

    public void delNum(int[] nums, int del) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == del) {
                
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j+1];
                }

                nums[nums.length -1] = 0;
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter 5 numbers");

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Number " + (i+1) + " : ");
            nums[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.print("Choose a number to delete: ");
        int del = in.nextInt();

        in.close();

        main.delNum(nums, del); 
    } 
}