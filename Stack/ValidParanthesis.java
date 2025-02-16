import java.util.*;
public class ValidParanthesis {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || 
                    (c == ')' && stack.peek() != '(') ||
                    (c == '}' && stack.peek() != '{') ||
                    (c == ']' && stack.peek() != '[')) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Close the scanner to free resources
        sc.close();
    }
}