import java.util.*;
public class TupleWithProduct {

    class Solution {
        public int tupleSameProduct(int[] nums) {
            HashMap<Integer, Integer> productMap = new HashMap<>();
            int n = nums.length;
            int count = 0;
    
            // Step 1: Iterate over all pairs (i, j)
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int product = nums[i] * nums[j];
                    // Step 2: Count the valid tuples
                    count += productMap.getOrDefault(product, 0) * 8;
                    // Step 3: Store the product count in the map
                    productMap.put(product, productMap.getOrDefault(product, 0) + 1);
                }
            }
            
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}