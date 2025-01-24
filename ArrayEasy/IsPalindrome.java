import java.util.*;

public class IsPalindrome {

    static class Solution {
        public boolean isPalindrome(int x) {
            // Negative numbers are not palindromes
            if (x < 0) {
                return false;
            }

            int original = x;  // Store the original number
            int rev = 0;

            // Reverse the number
            while (x > 0) {
                int digit = x % 10;
                rev = rev * 10 + digit;
                x /= 10;
            }

            // Check if the original number and reversed number are the same
            return original == rev;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        // Create an instance of Solution or use the static method if preferred
        Solution solution = new Solution();
        if (solution.isPalindrome(num)) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }

        sc.close();  // Close the scanner to free resources
    }
}
