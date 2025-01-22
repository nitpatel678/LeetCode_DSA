class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            digits[i]++; // Increment the current digit
            if (digits[i] < 10) {
                return digits; // No carry, return the result
            }
            digits[i] = 0; // Set current digit to 0 and carry over
        }
        
        // If we have a carry after processing all digits (e.g., [9, 9] -> [1, 0, 0])
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Set the first digit to 1
        return newDigits; // Remaining digits are already 0 by default
    }
}
