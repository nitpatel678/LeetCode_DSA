import java.util.*;
public class validPerfectSquare {

    class Solution {
        public boolean isPerfectSquare(int num) {
            if (num == 1) return true;
    
            long left = 1, right = num;
            
            while (left <= right) {
                long mid = left + (right - left) / 2;
                long square = mid * mid;
                
                if (square == num) return true;
                else if (square < num) left = mid + 1;
                else right = mid - 1;
            }
            
            return false;
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}