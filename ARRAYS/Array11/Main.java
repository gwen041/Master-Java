package ARRAYS.Array11;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers you want to enter?: ");
        int n = in.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i+1) + ": ");
            arr[i] = in.nextInt();
        }

        in.close();

        System.out.println(Arrays.toString(arr));
                

        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    
                    if (i == j) {
                        continue;
                    }
                System.out.println("\nNumber " + (i+1) + " and " + (j+1) + " are duplicates (" + arr[i] + ")");  
                }
            }
        } 
    }
}