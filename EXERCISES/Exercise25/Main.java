package EXERCISES.Exercise25;

import java.util.Scanner;

public class Main {

    public int countVowels(char[] ch, char[] vowels) {
        int countVows = 0;

        for (int i = 0; i < ch.length; i++) {

            for (int j = 0; j < vowels.length; j++) {
                if (ch[i] == vowels[j]) {
                    countVows++;
                }
            }
        }
        return countVows;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.nextLine();

        in.close();

        char[] ch = word.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Number of vowels in the string: " + main.countVowels(ch, vowels));
    }  
}