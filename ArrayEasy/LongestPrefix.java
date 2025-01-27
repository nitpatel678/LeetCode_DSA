import java.util.*;

class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Handle edge case
        }

        Arrays.sort(strs); // Sort the array lexicographically

        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        // Compare characters of the first and last strings
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

}

public class LongestPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}