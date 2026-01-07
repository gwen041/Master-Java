package EXERCISES.Exercise13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Scanner in = new Scanner(System.in);

        
        System.out.print("Input a string: ");
        String sentence = in.nextLine();



        System.out.println(main.penultimate(sentence));

        in.close();
    }

    public String penultimate(String sentence){
        StringBuilder sb = new StringBuilder();
        for(int i = sentence.length() - 1; i >= 0; i--){
            if(sentence.charAt(i) == ' '){
                sb.append(sentence.substring(0, i));
                break;
            }
        }
        
        StringBuilder sb2 = new StringBuilder();
        for(int i = sb.length() - 1; i >= 0; i--){
            if(sb.charAt(i) == ' '){
                break;
            }

            sb2.append(Character.toString(sb.charAt(i)));
            
        }
        return sb2.reverse().toString();
    }
}
