import java.util.*;
public class ReverseTheList {
    public static class ListNode {
        int data;
        ListNode next;
        ListNode (int data){
            this.data = data;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            // Base case: If the list is empty or has only one node, return head
            if (head == null || head.next == null) {
                return head;
            }
    
            // Recursively reverse the rest of the list
            ListNode newHead = reverseList(head.next);
    
            // Reverse the links
            head.next.next = head;
            head.next = null;
    
            return newHead;
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}