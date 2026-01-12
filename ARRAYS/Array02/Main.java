package ARRAYS.Array02;

public class Main {
    public static void main (String[] args) {
        int[][] arr = {{10, 20, 30}, {40, 50, 60, 70}};

        int largestLength = 0;
 
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

