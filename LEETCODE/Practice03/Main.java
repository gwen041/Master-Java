package LEETCODE.Practice03;

import java.util.HashSet;

public class Main {

  public boolean containsDuplicate(int[] nums) {

    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {

      if (set.contains(nums[i])) {
        return true;
      }
        set.add(nums[i]);
    }
      return false;
  }

  public static void main(String[] args) {
    Main main = new Main();

    int[] nums = {1, 2, 3, 1};

    System.out.print(main.containsDuplicate(nums));
  }
}