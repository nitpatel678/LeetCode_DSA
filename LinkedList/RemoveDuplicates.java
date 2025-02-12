import java.util.*;
public class RemoveDuplicates {
    public static class ListNode {
        int data;
        ListNode next;
        ListNode ( int data){
            this.data = data;
        }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return head; // Handle empty list
            
            ListNode first = head;
            
            while (first.next != null) { // Ensure first.next is not null
                if (first.data == first.next.data) {
                    first.next = first.next.next; // Skip duplicate
                } else {
                    first = first.next; // Move to next distinct node
                }
            }
            
            return head;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}