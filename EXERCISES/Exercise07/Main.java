package EXERCISES.Exercise07;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        num = in.nextInt();

        String n = Integer.toString(num);

        StringBuilder sb1 = new StringBuilder();
        sb1.append(n).append(n);
        //String n2 = sb1.toString();

        StringBuilder sb2 = new StringBuilder();
        sb2.append(n).append(n).append(n);
        //String n3 = sb2.toString();


        System.out.print(n + " + " + sb1 + " + " + sb2);

        int num2 = Integer.parseInt(sb1.toString());
        int num3 = Integer.parseInt(sb2.toString());
        
        System.out.println(" = " + (num + num2 + num3));

        in.close();
    }
}