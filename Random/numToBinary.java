import java.util.*;
public class numToBinary {
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder result = new StringBuilder();
            int i = a.length() - 1, j = b.length() - 1, carry = 0;
    
            while (i >= 0 || j >= 0 || carry > 0) {
                int sum = carry;
                if (i >= 0) sum += a.charAt(i--) - '0'; // Convert char to int
                if (j >= 0) sum += b.charAt(j--) - '0'; 
    
                result.append(sum % 2); // Append binary digit
                carry = sum / 2; // Update carry
            }
    
            return result.reverse().toString(); // Reverse for correct order
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}