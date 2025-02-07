import java.util.*;
// Build staircase with these coins
public class ArrangingCoins {
    class Solution {
        public int arrangeCoins(int n) {
            int low = 0 , high = n;
            while (low<=high) {
                int mid = low + (high-low) / 2;
                int sum = mid * (mid + 1)/2;
                if (sum==n) {
                    return (int)mid;
                }
                else if (sum<n) {
                    return low = mid + 1;
                }
                else {
                    return high = mid -1;
                }
            }
            return (int ) high ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}