import java.util.Scanner;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int result = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (i * i == x) return i;
            if (i * i > x) {
                result = i - 1;
                break;
            }
        }

        return result;
    }
}

public class SqrtFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();

        Solution solution = new Solution();
        int result = solution.mySqrt(a);

        System.out.println("The square root is: " + result);

        sc.close(); // Close the scanner to free resources
    }
}
