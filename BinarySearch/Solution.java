import java.util.*;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (letters[mid] <= target) {  // If letter at mid is less than or equal to target, move right
                low = mid + 1;
            } else {  // If letter at mid is greater than target, move left
                high = mid - 1;
            }
        }

        // If no element is greater, return the first element (wrap around)
        return letters[low % letters.length];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}