package IO.Prac01;

import java.io.File;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File obj = new File("C:\\Users\\PLP\\Documents\\IO STRMS\\prac.txt");

        try {
            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            }
            else {
                System.out.println("File already exists");
            }
        }
        catch(IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();

        }

        System.out.println("What do you want to write in the file? ");
        String word = in.nextLine();

        in.close();

        try (FileOutputStream obj2 = new FileOutputStream("C:\\Users\\PLP\\Documents\\IO STRMS\\prac.txt")) {
            obj2.write(word.getBytes());
            System.out.println("Successfully wrote to file!");
        }
        catch (IOException e) {
            System.out.println("Error occured in writing to file.");
            e.printStackTrace();
        }
    } 
}
