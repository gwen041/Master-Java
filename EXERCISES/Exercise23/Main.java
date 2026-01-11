package EXERCISES.Exercise23;

public class Main {
    public static void main(String[] args) {
       
        boolean[][] array = {{true, false, false}, {false, true, false}};

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". " );

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]) {
                    System.out.print("t ");
                } 
                else {
                    System.out.print("f ");
                }
            }
        System.out.println();
        }  
    }
}
