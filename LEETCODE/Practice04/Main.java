package LEETCODE.Practice04;

public class Main {
  
  public int numJewelsInStones(String jewels, String stones) {
    int output = 0;

    for(int i = 0; i < jewels.length(); i++) {

      for (int j = 0; j < stones.length(); j++) {

        if (jewels.charAt(i) == stones.charAt(j)) {
          output++;
        }
      }
    }
    return output;
  }

  public static void main(String[] args) {
    Main main = new Main();

    String jewels = "aA";
    String stones = "aAAbbbb";

    System.out.print(main.numJewelsInStones(jewels, stones));
  }
}
