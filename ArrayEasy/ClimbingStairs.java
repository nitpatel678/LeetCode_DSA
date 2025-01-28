import java.util.*;
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n; // Base cases: 1 step = 1 way, 2 steps = 2 ways.
        }
        int a = 1, b = 2; // Represents the number of ways to climb to the 1st and 2nd step.
        for (int i = 3; i <= n; i++) {
            int temp = a + b; // Current step can be reached either from the previous step or two steps back.
            a = b; // Update a to b.
            b = temp; // Update b to the new value.
        }
        return b; // Return the number of ways to reach the nth step.
    }
}

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}