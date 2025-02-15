import java.util.*;
public class RemoveElements {

    public static class ListNode{
        int data ;
        ListNode next;

        ListNode(int data){
            this.data = data;
        }
    }

    // Function to print the linked list
    public static void printLinkedList(ListNode head){
        while (head!=null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    // Function to print the list
    public static ListNode removeElement(ListNode head ,int val){
        if (head == null) {
            return null;
        }
        head.next = removeElement(head.next, val); // Recursively process the next node
        return (head.data == val) ? head.next : head; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode a = new ListNode(56);
        ListNode b = new ListNode(57);
        ListNode c = new ListNode(58);
        ListNode d = new ListNode(57);
        ListNode e = new ListNode(57);
        ListNode f = new ListNode(61);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // Close the scanner to free resources
        sc.close();
    }
}