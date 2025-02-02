import java.util.*;
public class MoveZeros {

    class Solution {
        public void moveZeroes(int[] nums) {
            int n = nums.length-1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[n];
                    nums[n] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}