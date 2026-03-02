package ARRAYS.Array13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    List<Integer> nums = new ArrayList<>();

    System.out.println("Please input 5 numbers:");
    for (int i = 0; i < 5; i++) {
      int num = in.nextInt();
      nums.add(num);
    }
    in.close();

    System.out.print(nums);

    if (nums.contains(0) || nums.contains(-1)) {
        System.out.println("The array contains 0 or -1.");
    } else {
        System.out.println("The array is without 0 and -1.");
    }

  }
}