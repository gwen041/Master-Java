package EXERCISES.Exercise05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String word;
        int lettSum = 0; 
        int numSum = 0;
        int spaceSum = 0;
        int otherSum = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        word = in.nextLine();

        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char temp = chars[i];
        
            if (Character.isLetter(temp)) {
                lettSum += 1;
                //System.out.print("Letters: " + letter.length + "\n" + letter);  
            } 
            else if (Character.isDigit(temp)) {
                numSum += 1;
            } 
            else if (Character.isWhitespace(temp)) {
                spaceSum += 1;
            } 
            else {
                otherSum += 1;
            }

           

        } 
        System.out.println("Letters: " + lettSum);
        System.out.println("Numbers: " + numSum);
        System.out.println("Spaces: " + spaceSum);
        System.out.println("Others: " + otherSum);

        in.close();
    }
}