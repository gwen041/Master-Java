package EXERCISES.Exercise06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String word;
        char temp;
        int l = 0, n = 0, s = 0, o = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        word = in.nextLine();

        char[] chars = word.toCharArray();

        int cLength = chars.length;

        char[] letters = new char[cLength];
        char[] nums = new char[cLength];
        char[] spaces = new char[cLength];
        char[] others = new char[cLength];

        for (int i = 0; i < cLength; i++) {
            temp = chars[i];

            if (Character.isLetter(temp)) {
                letters[l++] = temp;
               
            }
            else if (Character.isDigit(temp)) {
                nums[n++] = temp;
            
            }
            else if (Character.isWhitespace(temp)) {
                spaces[s++] = temp;
         
            } else {
                others[o++] = temp;
             
            }
        }

        

        System.out.println("Letters:" + "( " + new String(letters, 0, l) + " )" + " = " + l);
        System.out.println("Numbers:" + "( " + new String(nums, 0, n) + " )" + " = " + n);
        System.out.println("Spaces: " + "( " + new String(spaces, 0, s) + " )" + " = " + s);
        System.out.println("Others: " + "( " + new String(others, 0, o) + " )" + " = " + o);


        in.close();

    }
}