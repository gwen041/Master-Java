package EXERCISES.Exercise24;

import java.util.Scanner;

public class Main {

    public int countZero(char[] bits) {
        int zeros = 0;

        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == '0') {
                zeros++;
            }
        }
        return zeros;
    }

    public int countOne(char[] bits) {
        int ones = 0;

        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == '1') {
                ones++;
            }
        }
        return ones;
    }

    public static void main(String[] args) {
        Main main = new Main();
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scan.nextInt();

        scan.close();

        String binary = Integer.toBinaryString(num);

        char[] bits = binary.toCharArray();

        System.out.printf("Binary of %d is: %s ", num, binary);
        System.out.println("\nNumber of zero bits: " + main.countZero(bits));
        System.out.println("Number of one bits: " + main.countOne(bits));
    }
}
// Expected Output:
// Input first number: 25
// Binary representation of 25 is: 11001
// Number of zero bits: 2