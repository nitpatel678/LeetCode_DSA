import java.util.*;
public class MaximumAscendingSumArray {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int maxSum = 0;
            int currentSum = nums[0];  // Start with the first element
        
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    // Add to the current sum if the sequence is ascending
                    currentSum += nums[i];
                } else {
                    // If the sequence breaks, update maxSum and reset currentSum
                    maxSum = Math.max(maxSum, currentSum);
                    currentSum = nums[i];  // Start a new sequence
                }
            }
        
            // Check for the last ascending sequence
            maxSum = Math.max(maxSum, currentSum);
        
            return maxSum;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}