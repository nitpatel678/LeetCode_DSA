import java.util.*;
public class ValidMountainArray {

    class Solution {
        public boolean validMountainArray(int[] arr) {
            boolean isarray = false;
            int i = (arr.length)/2;
            for (int j = 0; j < (arr.length); j++) {
                if ((arr[j]<arr[j+1])|| (arr[i]>arr[i+1])) {
                    isarray = true;
                }
            }
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]<arr[j+1]) {
                    isarray = true;
                }
            }
            return isarray;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}