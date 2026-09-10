package LEETCODE.Practice02;

public class Main {
  
    public int minOperations(int[] nums, int k) {
        int operations = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++ ){
            sum += nums[i];
        }

        if(sum % k == 0) {
            return operations;
        } else {
            do {
                sum--;
                operations++;
            } while (!(sum % k == 0));
        }
       return operations; 
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {3, 9, 7};
        int k = 5;

        System.out.println(main.minOperations(nums, k));
    }
}