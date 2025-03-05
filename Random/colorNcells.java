import java.util.*;
public class colorNcells{
    class Solution {
        public long coloredCells(int n) {
            int count = 0;
            if (n==1) {
                count = 1;
                return count; 
            }
            while (n>0) {
                count = n * 4;
                n--;
            }
            count = count + 1;
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}