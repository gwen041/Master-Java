package EXERCISES.Exercise14;

import java.util.Scanner;

public class Main {

    public String penultimate(String sentence) {
            int sentLength = sentence.length();
            int i;

            StringBuilder sb = new StringBuilder();
            for (i = sentLength - 1; i > 0; i--) {
                if (sentence.charAt(i) == ' ') {
                    i--;
                    break;   
                }
            }
            while (sentence.charAt(i) != ' ') {
                sb.append(sentence.charAt(i));
                i--;
            }
        return sb.reverse().toString();       
    }

    public static void main(String[] args) {
        Main main = new Main();
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        System.out.println(main.penultimate(sentence));

        scan.close();
    }
}

    

