import java.util.*;
public class FourSum {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Set<List<Integer>> set = new HashSet<>();
            Arrays.sort(nums);
            int n = nums.length;
            for (int i = 0; i < n-3; i++) {
                for (int j = i+1; j < n-2; j++) {
                    for (int k = j+1;k < n-1; k++) {
                        for (int l = 0; l < n; l++) {
                            long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                            if (sum==target) {
                                set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                            }
                        }
                    }
                }
            }

            return new ArrayList<>(set);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}