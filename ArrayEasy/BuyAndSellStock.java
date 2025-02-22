import java.util.*;
public class BuyAndSellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            int day = 0;
            int minPrice = prices[0]; // Start with the first day's price
        
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i]; // Update minimum price
                } else if (prices[i] - minPrice > day) {
                    day = prices[i] - minPrice; // Update max profit
                }
            }
        
            return day;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}