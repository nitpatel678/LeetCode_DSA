import java.util.*;
/*
 * Given an array of integers nums sorted in non-decreasing order, 
 * find the starting and ending position of a given target value.
 */
public class FirstAndLastPosition {

    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] result = new int[]{-1, -1};
            result[0] = findFirst(nums, target);
            result[1] = findLast(nums, target);
            return result;
        }
    
        private int findFirst(int[] nums, int target) {
            int low = 0, high = nums.length - 1, index = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    index = mid;  // Store potential first occurrence
                    high = mid - 1; // Continue searching left
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return index;
        }
    
        private int findLast(int[] nums, int target) {
            int low = 0, high = nums.length - 1, index = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    index = mid;  // Store potential last occurrence
                    low = mid + 1; // Continue searching right
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return index;
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}