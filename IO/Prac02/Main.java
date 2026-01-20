package IO.Prac02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        try (FileInputStream inp = new FileInputStream("C:\\Users\\PLP\\Pictures\\Saved Pictures\\code\\pikmin.jpg");) {
            FileOutputStream out = new FileOutputStream("C:\\Users\\PLP\\Pictures\\Saved Pictures\\code\\copypikmin.jpg");

            int a;

            while ((a = inp.read()) != -1) {
                out.write(a);
            }
            System.out.println("Successfully copied.");
            out.close();
        }
        catch (IOException e) {
            System.out.println("An error occured.");
        }
    }
}