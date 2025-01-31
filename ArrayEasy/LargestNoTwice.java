import java.util.*;
public class LargestNoTwice {

    class Solution {
        public int dominantIndex(int[] nums) {
            int maxIndex = 0;
                for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
            }
            
            for (int i = 0; i < nums.length; i++) {
                if (i != maxIndex && nums[maxIndex] < 2 * nums[i]) {
                    return -1;
                }
            }
    
            return maxIndex;
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}