package EXERCISES.Exercise32;

import java.util.Scanner;

public class Main {

    public boolean hasCorrectMin(String pass) {
        return pass.length() >= 8;
    }

    public boolean hasOnlyLettersAndDigits(String pass) {
        boolean isValid = true;
        for (char c : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                isValid = false;
            }
        }
        return isValid;
    }

    public boolean hasTwoDigits(String pass) {
        int digit = 0;

        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                digit++;
            }
        }
        return digit >= 2;
    }

    public void validatePass(boolean hasCorrectMin, boolean hasOnlyLettAndDigs, boolean hasTwoDigs) {

        boolean isPassValid = hasCorrectMin && hasOnlyLettAndDigs && hasTwoDigs;

        if (!hasCorrectMin) {
            System.out.println("Password must have atleast eight characters!");
        }

        if (!hasOnlyLettAndDigs) {
            System.out.println("Password should consists of only letters and digits!");
        }
        
        if (!hasTwoDigs) {
            System.out.println("Password must contain atleast two digits!");
        }

        if (isPassValid) {
            System.out.println("Your password is valid!");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = in.nextLine();

        in.close();

        boolean isValid1 = main.hasCorrectMin(pass);
        boolean isValid2 = main.hasOnlyLettersAndDigits(pass);
        boolean isValid3 = main.hasTwoDigits(pass);

        main.validatePass(isValid1, isValid2, isValid3); 
    }
}