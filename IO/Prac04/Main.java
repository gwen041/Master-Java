package IO.Prac04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public void readFile() {
        System.out.println("(THIS IS THE CONTENT OF THE FILE) \n");
        try(FileInputStream inp = new FileInputStream("C:\\Users\\PLP\\Documents\\IO STRMS\\copyprac.txt")) {

            int i;

            while ((i = inp.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("\n\nDone!");

        } 
        catch (IOException e) {
            System.out.println("An error occured.");
        }
    }

    public void writeFile(String word) {
        try (FileOutputStream out = new FileOutputStream("C:\\Users\\PLP\\Documents\\IO STRMS\\copyprac.txt", true)) {
            out.write(word.getBytes());
            
            System.out.println("Successfully wrote to file.");
        }
        catch (IOException e) {
            System.out.println("An error occured.");
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
       

        System.out.print("Do you want to write to file? (Y/N): ");
        String choice = in.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            System.out.print("Write your text here: ");
            String word = in.nextLine();
            main.writeFile(word);
            main.readFile();
        } 
        else {
            System.out.println("Program is done.");
        }
     
        in.close();      
    }   
}