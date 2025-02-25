import java.util.*;
public class LongestPalindrome{

    class Solution {
        public String longestPalindrome(String s) {
            if (s.length() <= 1) return s;
    
            int start = 0, maxLen = 0;
    
            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j < s.length(); j++) {
                    if (isPalindrome(s, i, j) && (j - i + 1) > maxLen) {
                        start = i;
                        maxLen = j - i + 1;
                    }
                }
            }
    
            return s.substring(start, start + maxLen);
        }
    
        private boolean isPalindrome(String s, int left, int right) {
            while (left < right) {
                if (s.charAt(left++) != s.charAt(right--)) {
                    return false;
                }
            }
            return true;
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}