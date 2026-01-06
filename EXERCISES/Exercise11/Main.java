package EXERCISES.Exercise11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
    
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number (string): ");
        str = in.nextLine();

        int num = Integer.parseInt(str);

        System.out.print("The integer value is: " + num);

        in.close();

        
    }
}