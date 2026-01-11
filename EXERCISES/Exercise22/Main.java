package EXERCISES.Exercise22;

public class Main {

    public int largestNum(int[] nums) {
        int largestNum = 0;
        
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] > largestNum) {
                largestNum = nums[i];   
            } 
        }

        return largestNum;
    }
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {12, 3, 234, 24, 5};

        System.out.println(main.largestNum(nums));
    }
    
}
