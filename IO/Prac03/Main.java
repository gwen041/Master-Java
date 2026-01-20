package IO.Prac03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try (FileOutputStream out = new FileOutputStream("C:\\Users\\PLP\\Documents\\IO STRMS\\prac.txt", true)) {
            System.out.print("What do you want to add in the file (txt)?: ");
            String word = in.nextLine();
            in.close();
            
            
            out.write(word.getBytes());
            System.out.println("Successfully added to file!");

        }
        catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }

        try (FileInputStream inp = new FileInputStream("C:\\Users\\PLP\\Documents\\IO STRMS\\prac.txt")) {
            FileOutputStream out2 = new FileOutputStream("C:\\Users\\PLP\\Documents\\IO STRMS\\copyprac.txt");

            int a;

            while ((a = inp.read()) != -1) {
                out2.write(a);
            }

            out2.close();
            System.out.println("Copied successfully!");

        }
        catch (IOException e) {
            System.out.println("An error occured.");
        }
    }
}