package ARRAYS.Array02;

public class Main {
    public static void main (String[] args) {
        int[][] arr = {{10, 20, 30}, {40, 50, 60, 70}};

        int largestLength = 0;
        // 0, 0   1,0
        // 0, 1   1,1
        // 0, 2   1,2
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > largestLength) {
                largestLength = arr[i].length;
            }  
        }

        
        int j = 0;

        while (j < largestLength) {
            if (j < arr[0].length) {
                System.out.print(arr[0][j] + " ");
            }
            else {
                System.out.print("   ");
            }

            if (j < arr[1].length) {
                System.out.print(arr[1][j]);
            }
            else {
                System.out.print("   ");
            }
            System.out.println();
        j++;    
        }
    }
    
}

// Write a Java program to print an array after changing the rows and columns of a two-dimensional array.

// Original Array:
// 10 20 30
// 40 50 60
// After changing the rows and columns of the said array:
// 10 40
// 20 50
// 30 60
