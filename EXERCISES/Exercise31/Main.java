package EXERCISES.Exercise31;

import java.util.Scanner;

public class Main {

    public void midChar(StringBuilder sb) {
        int length = sb.length();
        int mid = 0;

        if (length % 2 == 0) {
            mid = (length / 2) - 1;
            System.out.println("The middle character in the string is: " +  sb.charAt(mid) + sb.charAt(mid + 1));
        } 
        else {
            mid = length / 2;  
            System.out.println("The middle character in the string is: " + sb.charAt(mid));
        }  
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.nextLine();

        in.close();

        StringBuilder sb = new StringBuilder();
        sb.append(str);

        main.midChar(sb);
    } 
}