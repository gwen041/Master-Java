package ARRAYS.Array03;

import java.util.*;

public class Main {

    public double calcAve(int[] nums) {
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length; 
    }

    public ArrayList<Integer> greaterThanAvg(int[] nums, double avg) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > avg) {
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers you want to enter?: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = in.nextInt();
        }

        in.close();

        double avg = main.calcAve(nums);
        ArrayList<Integer> greatNums = main.greaterThanAvg(nums, avg);

        System.out.println("\nThe Array: " + Arrays.toString(nums));
        System.out.printf("The AVERAGE of the array is: %.2f", avg);
        System.out.println("\nNumbers in the array that are greater than the average: " + greatNums);
    }
}

// Write a Java program that finds numbers greater than the average of an array.

