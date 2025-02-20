import java.util.*;
public class ValidPalindrome {

    class Solution {
        public boolean isPalindrome(String s) {
            StringBuilder a = new StringBuilder();
    
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    a.append(Character.toLowerCase(c));
                }
            }
    
            int left = 0, right = a.length() - 1;
            while (left < right) {
                if (a.charAt(left) != a.charAt(right)) {
                    return false;
                }
                left++;
                right--;
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