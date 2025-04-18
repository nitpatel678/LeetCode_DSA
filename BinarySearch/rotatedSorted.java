import java.util.*;
public class rotatedSorted {
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right ){
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                   
                }
                else if (nums[left]<= nums[mid]){
                    if (nums[left] <= target && target < nums[mid]){
                        right = mid - 1;
                    }
                    else {
                        left = mid + 1;
                        
                    }
                }
                else {
                    if (nums[mid] < target && target <= nums[right]){
                        left = mid + 1;
                    }
                    else {
                        right = mid - 1;
                    }
                }
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}