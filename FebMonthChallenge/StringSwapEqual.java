import java.util.*;
public class StringSwapEqual {
    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            if (s1.equals(s2)) {
                return true; // Strings are already equal
            }
            
            int n = s1.length();
            int first = -1, second = -1;
            
            for (int i = 0; i < n; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (first == -1) {
                        first = i; // First mismatch
                    } else if (second == -1) {
                        second = i; // Second mismatch
                    } else {
                        return false; // More than 2 mismatches
                    }
                }
            }
            
            if (second == -1) {
                return false; // Only one mismatch, not fixable with a swap
            }
            
            return s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first);
        }
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}