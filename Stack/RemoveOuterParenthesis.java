import java.util.*;
public class RemoveOuterParenthesis {

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == ')') stack.pop();
            if (!stack.isEmpty()) result.append(c);
            if (c == '(') stack.push(c);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}