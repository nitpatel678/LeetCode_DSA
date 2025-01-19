import java.util.*;

public class RemoveRepeatedSorted {

    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
            
            int k = 1; // Initialize the pointer for unique elements
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[k] = nums[i];
                    k++; // Move the pointer for the next unique element
                }
            }

            return k; // k will represent the number of unique elements
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        RemoveRepeatedSorted obj = new RemoveRepeatedSorted();
        Solution solution = obj.new Solution();
        int k = solution.removeDuplicates(arr);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
