import java.util.*;
public class LongestContinuousSequence {
    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            int ans = 0;
            int diff = 0;
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                diff = nums[i] - nums[i-1];
                for (int j = 1; j < nums.length; j++) {
                    int temp = nums[j]-nums[j-1];
                    if (temp==diff) {
                        ans = ans + 1;
                    }
                    else{
                        ans = 1;
                    }
                }
            }
            
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}