import java.util.*;
public class MiddleOfLinkedList {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode (int data){
            this.data = data;
        }
    }

    // Function to find middle of linkedlist
    public static ListNode middleLinked(ListNode head){
        int size = 0;
        ListNode temp = head;
        while (temp!=null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        if (size%2==0) {
            int var = (size/2)+1;
            ListNode ans = head;
            for (int i = 0; i < var-1; i++) {
                ans = ans.next;
            }
            return ans;
        }
        else{
            int var = (size/2)+1;
            ListNode ans = head;
            for (int i = 0; i < var-1; i++) {
                ans = ans.next;
            }
            return ans;
        }
    }
    //Function to print the linked list
    public static void print(ListNode head){
        while (head!=null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode a = new ListNode(56);
        ListNode b = new ListNode(57);
        ListNode c = new ListNode(58);
        ListNode d = new ListNode(59);
        ListNode e = new ListNode(60);
        ListNode f = new ListNode(61);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        print(a);
        System.out.println("Result:");
        ListNode result = middleLinked(a);
        System.out.println(result.data);
        // Close the scanner to free resources
        sc.close();
    }
}