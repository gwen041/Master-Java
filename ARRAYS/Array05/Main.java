package ARRAYS.Array05;

import java.util.Scanner;

public class Main {

    public void searchNum(int[] nums, int findNum) {
        boolean isFound = false;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == findNum) {
                System.out.println(findNum + " is found!");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println(findNum + " is not found!");
        }
    }    

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers you want to input?: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i ++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = in.nextInt();
        }

        System.out.print("Find a number: ");
        int findNum = in.nextInt();

        in.close();

        main.searchNum(nums,findNum);
    }
}

// Write a Java program to test if an array contains a specific value
