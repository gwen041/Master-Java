package LEETCODE.Practice05;

public class Main {

  public int finalValueAfterOperations(String[] operations) {
    int x = 0;

    for (int i = 0; i < operations.length; i++) {
      if (operations[i].contains("--")) {
        x--;
      } else if (operations[i].contains("++")) {
        x++;
      }
    }
    return x;
  }  

  public static void main(String[] args) {
    Main main = new Main();

    String[] operations = {"--X","X++","X++"};

    System.out.print(main.finalValueAfterOperations(operations));
  }
}