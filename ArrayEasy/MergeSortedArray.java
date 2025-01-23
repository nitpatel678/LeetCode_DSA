import java.util.*;
public class MergeSortedArray {
    class arrayPart {
        static void print_2darray(int[][] arr) {
            System.out.println("Printing the 2D array:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }
    
        static void print_array(int[] arr) {
            System.out.println("Printing the 1D array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
    
        static int[][] create2d_array(int x, int y) {
            Scanner sc = new Scanner(System.in);
            int[][] arr = new int[x][y];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            return arr;
        }
    
        static int[] create_array(int size) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[size];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            return arr;
        }

        class Solution {
            public void merge(int[] nums1, int m, int[] nums2, int n) {
                // Pointers for nums1, nums2, and the last position in nums1
                int i = m - 1; // Last valid element in nums1
                int j = n - 1; // Last element in nums2
                int k = m + n - 1; // Last position in nums1 (including extra space)
        
                // Merge nums1 and nums2 from the end
                while (i >= 0 && j >= 0) {
                    if (nums1[i] > nums2[j]) {
                        nums1[k--] = nums1[i--]; // Place larger element at the end
                    } else {
                        nums1[k--] = nums2[j--]; // Place larger element at the end
                    }
                }
        
                // If there are remaining elements in nums2, copy them
                while (j >= 0) {
                    nums1[k--] = nums2[j--];
                }
        
                // No need to copy the remaining nums1 elements because they are already in place
            }
        }
        
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}