package EXERCISES.Exercise07;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int num;

        //OTHER WAY

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.nextInt();

        String n = Integer.toString(num);

        String nn = n + n;
        String nnn = n + n + n;

        System.out.print(n + " + " + nn + " + " + nnn);

        int num2 = Integer.parseInt(nn);
        int num3 = Integer.parseInt(nnn);

        System.out.println(" = " + (num + num2 + num3));

        in.close();









        //FIRST TRY
        /*Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        num = in.nextInt();

        String n = Integer.toString(num);

        StringBuilder sb1 = new StringBuilder();
        sb1.append(n).append(n);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(n).append(n).append(n);
        
        System.out.print(n + " + " + sb1 + " + " + sb2);

        int num2 = Integer.parseInt(sb1.toString());
        int num3 = Integer.parseInt(sb2.toString());
        
        System.out.println(" = " + (num + num2 + num3));

        in.close();*/

        

        

    }
}