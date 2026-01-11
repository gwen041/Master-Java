package EXERCISES.Exercise20;

public class Main {
    String str, ending;

    public Main(String str, String ending) {
        this.str = str;
        this.ending = ending;
        
    }
    public boolean endChecker() {
            return str.endsWith(ending);
        }

    public static void main(String[] args) { 
        
        Main string1 = new Main("ironman", "an");
        Main string2 = new Main("daredevil", "d");
        
        System.out.println("First string: " + string1.str + "\n" + "It ends with: " + string1.ending + " (" + string1.endChecker() + ")");
        System.out.println("\nFirst string: " + string2.str + "\n" + "It ends with: " + string2.ending + " (" + string2.endChecker() + ")");
    //     System.out.println(string1.endChecker());   
    //     System.out.println(string2.endChecker());
    }   
}
