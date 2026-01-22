package EXERCISES.Exercise29;

import java.util.Scanner;

public class Main {

    public int wordCounter(char[] sentence) {
        int count = 1;

        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == ' ') {
                count++;
            
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String input = in.nextLine();

        char[] sentence = input.toCharArray();

        in.close();

        System.out.println("Number of words: "  + main.wordCounter(sentence));
    }   
}