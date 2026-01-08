package EXERCISES.Exercise15;

import java.util.Scanner;

public class Main {

    public String capWord (String sentence) {
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < sentence.length() - 1; i++) {
            if (i == 0) {
                sb1.append(Character.toUpperCase(sentence.charAt(i)));
                i++;

                while (sentence.charAt(i) != ' ') {
                    sb1.append(sentence.charAt(i));
                    i++;
                }
            }

            while (sentence.charAt(i) == ' ') {
                sb1.append(' ');
                i++;
                sb1.append(Character.toUpperCase(sentence.charAt(i)));
                i++;
            }
            
            if (Character.isLetter(sentence.charAt(i))) {
                sb1.append(sentence.charAt(i));
            }
            
        } 

        return sb1.toString();
    
    }


    public static void main(String[] args) {
        Main obj1 = new Main();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();

        System.out.println(obj1.capWord(sentence));

        in.close();



    }
    
}

