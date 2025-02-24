import java.util.*;

public class ReverseInteger {

    class Solution {
        public int reverse(int x) {
            int rev = 0;
            
            while (x != 0) {
                int digit = x % 10;
                
                // Check for overflow before multiplying by 10
                if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                    return 0;
                }
                
                rev = rev * 10 + digit;
                x /= 10;
            }
            
            return rev;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}