import java.util.*;
public class monotonicArray {
    class Solution {
        public boolean isMonotonic(int[] nums) {
            boolean isIncresaing = false , isDecresaing = false;
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i]<= nums[i+1]) {
                    isDecresaing = true;
                }

                if (nums[i]>=nums[i+1]) {
                    isIncresaing =true;
                }
            }
            return isIncresaing||isDecresaing;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}