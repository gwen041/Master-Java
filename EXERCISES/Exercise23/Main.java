package EXERCISES.Exercise23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter positive integers: ");
        int num = in.nextInt();

        in.close();

        String stringNum = Integer.toString(num);

        char[] arrNum = stringNum.toCharArray();

        int[] digit = new int[arrNum.length];

        for (int i = 0; i < arrNum.length; i++ ) {
            digit[i] = arrNum[i] - '0';
        }
       
        for (int dig : digit) {
            System.out.print(dig + " ");
        }

        int digit1 = digit[0];
        int digit2 = digit[1];

        System.out.println("\n" + (digit1 + digit2));
    }   
}




