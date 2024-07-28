/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node that points to the head of the list
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        // Calculate the size of the list
        int size = 0;
        while (current.next != null) {
            current = current.next;
            size++;
        }
        
        // Find the (size - n)th node
        int target = size - n;
        current = dummy;
        for (int i = 0; i < target; i++) {
            current = current.next;
        }
        
        // Remove the nth node from the end
        current.next = current.next.next;
        
        // Return the head of the modified list
        return dummy.next;
    }
}