import java.util.*;
public class ClearString {
    class Solution {
        public String clearDigits(String s) {
            Stack<Character> stack = new Stack<>();
            
            for (char ch : s.toCharArray()) {
                if (Character.isDigit(ch)) {
                    // Remove the closest non-digit character from stack
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(ch);
                }
            }
            
            // Build the resulting string
            StringBuilder result = new StringBuilder();
            for (char ch : stack) {
                result.append(ch);
            }
            
            return result.toString();
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}