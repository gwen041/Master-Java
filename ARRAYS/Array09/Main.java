package ARRAYS.Array09;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] median = new int[arr.length-2];

        for (int i = 0; i < arr.length-2; i++) {
            int k = 0;
            int j = i;

                while (k < 3) {
                    System.out.print(arr[j] + " ");
                    j++;
                    k++;
                    
                    if (k == 1) {
                        median[i] = arr[j];
                    }
                }  
        System.out.print(" (Median: " + median[i] + ")");
        System.out.println();
        }

        System.out.println("Array of median: " + Arrays.toString(median));
    } 
}