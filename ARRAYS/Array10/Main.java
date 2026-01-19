package ARRAYS.Array10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers you want to put in the array?: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        int element = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = element;
            element++;
        }

        in.close();
        
        System.out.println(Arrays.toString(arr));
        
        int[] max = new int[arr.length-2];

        for (int i = 0; i < arr.length-2; i++) {
            int k = 0;
            int j = i;

            while (k < 3) {
                System.out.print(arr[j] + " ");
                j++;
                k++;

                if (k == 2) {
                max[i] = arr[j];
                }
            }
        System.out.print("(Maximum: " + max[i] + ")");
        System.out.println(); 
        }
    System.out.println("\nArray of maximum: " + Arrays.toString(max));
    }
}