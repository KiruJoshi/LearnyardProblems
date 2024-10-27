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
        ListNode current = head;
        int size = 0;
        while(current != null){
            size++;
            current = current.next;
        }
        int index = size-n;
        if(index == 0){
            return head.next;
        }
        current = head;
        ListNode prev = null;
        while(index-- > 0) {
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        current.next = null;
        return head;
    }
}