import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            // Get the current character
            char current = s.charAt(i);

            // Check the next character for special cases
            if (i < s.length() - 1) {
                char next = s.charAt(i + 1);

                // Special cases
                if (current == 'I' && next == 'V') {
                    num += 4;
                    i++; // Skip the next character
                    continue;
                } else if (current == 'I' && next == 'X') {
                    num += 9;
                    i++;
                    continue;
                } else if (current == 'X' && next == 'L') {
                    num += 40;
                    i++;
                    continue;
                } else if (current == 'X' && next == 'C') {
                    num += 90;
                    i++;
                    continue;
                } else if (current == 'C' && next == 'D') {
                    num += 400;
                    i++;
                    continue;
                } else if (current == 'C' && next == 'M') {
                    num += 900;
                    i++;
                    continue;
                }
            }

            // Single character cases
            if (current == 'I') {
                num += 1;
            } else if (current == 'V') {
                num += 5;
            } else if (current == 'X') {
                num += 10;
            } else if (current == 'L') {
                num += 50;
            } else if (current == 'C') {
                num += 100;
            } else if (current == 'D') {
                num += 500;
            } else if (current == 'M') {
                num += 1000;
            }
        }

        return num;
    }
}
public class RomanInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}