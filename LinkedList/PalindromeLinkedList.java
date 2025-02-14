import java.util.*;
public class PalindromeLinkedList {

    public static class ListNode {
        int data;
        ListNode next;
        ListNode (int data){
            this.data = data;
        }    
    }

    // Function to print the linked list
    public static void printLinkedList(ListNode head ){
        while (head!=null){ 
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
    
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }
    
        int left = 0, right = arr.size() - 1;
        while (left < right) {
            if (!arr.get(left).equals(arr.get(right))) {
                return false;
            }
            left++;
            right--;
        }
    
        return true;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Close the scanner to free resources
        sc.close();
    }
}