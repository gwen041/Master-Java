package EXERCISES.Exercise30;

import java.util.Scanner;

public class Main {

    public void multTable(int n) {
        int product; 

        for (int i = 1; i <= 10; i++) {
            product = i * n;
            System.out.println(n + " x " + i + " = " + product);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        System.out.println("MULTIPLICATION TABLE");
        System.out.print("Choose a number you want to display: ");
        int n = in.nextInt();
    
        in.close();

        main.multTable(n);  
    }    
}