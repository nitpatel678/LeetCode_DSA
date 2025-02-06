import java.util.*;
public class BadVersionControl {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;  // Versions are 1-based
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid; // Look for earlier bad version
            } else {
                low = mid + 1; // Look in the later versions
            }
        }
        return low; // First bad version
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}