package EXERCISES.Exercise04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String word;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word/sentence to reverse: ");
        word = in.nextLine();

        //Reverse using array
        /*char[] chars = word.toCharArray();

        int i = chars.length -1;

        while (i >= 0) {
            System.out.print(chars[i--]); 
        }*/

        StringBuilder sb = new StringBuilder(word);

        String reversedWord = sb.reverse().toString();
        System.out.println("\nThe original input: " + word);
        System.out.println("The reversed input: " + reversedWord + "\n");


        in.close();
       
    }
    
}
