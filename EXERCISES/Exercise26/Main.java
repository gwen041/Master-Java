package EXERCISES.Exercise26;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {
        
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 6; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}